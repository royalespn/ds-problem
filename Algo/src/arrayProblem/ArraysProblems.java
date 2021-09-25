package arrayProblem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ArraysProblems {

    //01
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> visited = new HashMap<>();

        for(int i=0; i<=nums.length-1; i++){
            if(!visited.containsKey(nums[i])){
                visited.put(nums[i], 1);
            } else {
                visited.put(nums[i], visited.get(nums[i])+1);
            }
        }

        for( Map.Entry<Integer, Integer> entry : visited.entrySet()) {
            if(entry.getValue() == 1) return entry.getKey();
        }
        return -1;
    }

    @Test
    public void test_singleNumber(){
        int[] num = new int[]{ 2,2,3,2};
        Assertions.assertEquals(3,singleNumber(num));
        Assertions.assertEquals(99,singleNumber(new int[]{0,1,0,1,0,1,99}));

    }

    @Test
    public void test_singleNumber_lessLines(){
        int[] num = new int[]{ 2,2,3,2};
        Assertions.assertEquals(3,singleNumber_lessLines(num));
        Assertions.assertEquals(99,singleNumber_lessLines(new int[]{0,1,0,1,0,1,99}));

    }

    //similar 01
    public int singleNumber_lessLines(int[] nums) {

        Map<Integer, Integer> visited = new HashMap<>();

        for(int i=0; i<=nums.length-1; i++) {
            visited.put(nums[i], visited.getOrDefault(nums[i], 0) +1);
        }

        for( Map.Entry<Integer, Integer> entry : visited.entrySet()) {
            if(entry.getValue() == 1) return entry.getKey();
        }
        return -1;
    }

// 4: Remove All Adjacent Duplicates In String
public String removeDuplicates(String s) {

    char[] stack = new char[s.length()-1];
    int index = 0;

    for (int i = 0; i < s.length() ; i++) {
        if (index > 0 && stack[index-1] == s.charAt(i)) {
            index--;
        } else {
            stack[index] = s.charAt(i);
            index++;
        }
    }
    return new String(stack,0,index); //stack.toString();
}

    @Test
    public void removeDuplicates_test() {

        Assertions.assertEquals("ca", removeDuplicates("abbaca"));
        Assertions.assertEquals("ay", removeDuplicates("azxxzy"));

    }



    // Remove All Adjacent Duplicates In String
    @Test
    public void removeDuplicatesUsingStack_test() {

        Assertions.assertEquals("ca", removeDuplicatesUsingStack("abbaca"));
        Assertions.assertEquals("ay", removeDuplicatesUsingStack("azxxzy"));
        Assertions.assertEquals("", removeDuplicatesUsingStack("aaaaaaaa"));

    }


    public String removeDuplicatesUsingStack(String s) {

        Stack<Character> stack = new Stack<>();
        stack.push(s.trim().charAt(0));

        for (int i = 1; i < s.length(); i++) {

            if (!stack.empty()) {
                Character peek = stack.peek();
                if (peek.equals(s.charAt(i))) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        int stackSize = stack.size()-1;
        char[] c = new char[stack.size()];

        for(int x=0; x<=stack.size();x++){
            if(!stack.empty())
            c[stackSize--] = stack.pop();
        }
        return String.valueOf(c);

    }
}
