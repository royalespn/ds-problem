package in.co.iman.O1_findPairThatSumsToK;


// two pointer techniques

//time complexity o(nlogn)

import java.util.Arrays;

public class SortingArrayNUseTwoPointer_02 {
    public static void main(String[] args) {

        int[] arr = {4, 12, 5, 7, 2, 10};
        int k = 9;

        Arrays.sort(arr); //sorts the arrays
        boolean result = findPair(arr, k);
        System.out.println(result);
    }

    public static boolean findPair(int[] source, int res) {

        int start = 0;
        int end = source.length - 1;

        while (start < end) {
            if (source[start] + source[end] == res)
                return true;
            else
                if (source[start] + source[end] < res)
                start++;
            else
                if (source[start] + source[end] > res)
                end--;
        }

        return false;
    }
}
