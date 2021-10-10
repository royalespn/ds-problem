package leethCode.O7MinInRotatedSortedArray;


//https://www.youtube.com/watch?v=IzHR_U8Ly6c&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=157&ab_channel=NickWhite

/* Suppose an array sorted in ascending order is rotated
   at some pivot unknown to you
   ie, {1,2,3,4,5,6,7}; might become {4,5,6,7,0,1,2};

Input: {4,5,6,7,0,1,2};
Output: 0

Input: {3,4,5,1,2}
Output: 1*/


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumInRotatedSortedArray {

    private int findMinInRotatedSortedArray(int[] input) {

        if(input.length == 0 ) return -1;
        if(input.length == 1 ) return input[0];

        int left = 0;
        int right = input.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && input[mid] < input[mid - 1]) {
                return input[mid];
            } else if (input[left] < input[mid] && input[mid] > input[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return input[left];
    }

    @Test
    public void test() {
        int[] input = new int[]{4, 5, 6, 7, 0, 1, 2};
        int min = findMinInRotatedSortedArray(input);
        Assertions.assertEquals(0, min);

        int[] input2 = new int[]{3, 4, 5, 1, 2};
        int min2 = findMinInRotatedSortedArray(input2);
        Assertions.assertEquals(1, min2);
    }
}
