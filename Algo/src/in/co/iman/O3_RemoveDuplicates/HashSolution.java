package in.co.iman.O3_RemoveDuplicates;

//time complexity o(n)

import java.util.*;

public class HashSolution {

    public static void main(String[] args) {

        int[] arr = {4, 5, 3, 7, 10, 2, 4, 3, 30, 40, 10, 1};
        List<Integer> result = removeDuplicate(arr);

        for(int a : result){
            System.out.print(a+":");
        }

       // stream way to print
       // result.stream().forEach(System.out::println);

    }

    public static List removeDuplicate(int[] arr) {

        Map<Integer, Boolean> visited = new HashMap<>();
       List<Integer> resList = new ArrayList<>();
        for (Integer ar : arr) {
            if (!visited.containsKey(ar)) {
                resList.add(ar);
                visited.put(ar, true);
            }
        }
        return resList;
    }
}

