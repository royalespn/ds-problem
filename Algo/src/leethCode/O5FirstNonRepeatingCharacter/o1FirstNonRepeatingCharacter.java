package leethCode.O5FirstNonRepeatingCharacter;


//https://www.youtube.com/watch?v=5co5Gvp_-S0&ab_channel=NickWhite

/*
Given an String, find the first non repeating character

eg,
   aaabcccdeeef -> b
   abcbad -> c
*/


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.LinkedHashMap;
import java.util.Map;

public class o1FirstNonRepeatingCharacter {


    private static String findFirstNonRepeatingCharacter(String input) {

        Map<Character, Integer> visited = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            Character inputChar = input.charAt(i);
            if (!visited.containsKey(inputChar)) {
                visited.put(inputChar, 1);
            } else {
                visited.put(inputChar, visited.get(inputChar) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : visited.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey().toString();
            }
        }

        return "NotFound";
    }


/*    public static void main(String[] args) {

        String input = "aaabcccdeeef";
        String firstNonRepeat = findFirstNonRepeatingCharacter(input);
        System.out.println("----" + firstNonRepeat);
    }*/

    @Test
    public void test1() {

        String input = "aaabcccdeeef";
        String firstNonRepeat = findFirstNonRepeatingCharacter(input);
        Assert.assertEquals("b",firstNonRepeat);
        System.out.println("---- test1 " + firstNonRepeat);

    }

    @Test
    public void test2() {

        String input = "abcbad";
        String firstNonRepeat = findFirstNonRepeatingCharacter(input);
        Assert.assertEquals("c",firstNonRepeat);
        System.out.println("---- test2 " + firstNonRepeat);

    }

    @Test
    public void test3() {

        String input = "a";
        String firstNonRepeat = findFirstNonRepeatingCharacter(input);
        Assert.assertEquals("a",firstNonRepeat);
        System.out.println("---- test2 " + firstNonRepeat);

    }

    @Test
    public void test4() {

        String input = "";
        String firstNonRepeat = findFirstNonRepeatingCharacter(input);
        Assert.assertEquals("NotFound",firstNonRepeat);
        System.out.println("---- test2 " + firstNonRepeat);

    }
}
