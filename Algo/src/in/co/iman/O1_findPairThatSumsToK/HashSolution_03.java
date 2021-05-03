package in.co.iman.O1_findPairThatSumsToK;

//we are hashing the visited record and checking
// if the k-array-value is present on the hash

// time complexity o(n)

import java.util.HashMap;
import java.util.Map;

public class HashSolution_03 {

    public static void main(String[] args) {
        int[] arr = {4, 12, 5, 7, 2, 10};
        int k = 12;

        boolean result = findPair(arr, k);
        System.out.println(result);
    }

    private static boolean findPair(int[] arr, int k) {
        Map<Integer, Boolean> visitedMap = new HashMap<>();

        for(Integer value: arr){
            if(visitedMap.containsKey(k -value))
                return true;
            else visitedMap.put(value,true);
        }
        return false;
    }
}

