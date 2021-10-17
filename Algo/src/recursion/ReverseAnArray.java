package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ReverseAnArray {

    private static int[] reverseArray(int[] arr, int start, int end) {
        //  if (start >= end) return;

        if (!(start >= end)) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            reverseArray(arr, start + 1, end - 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 6, 7, 8, 9, 0, 12};
        reverseArray(arr, 0, arr.length - 1);
        System.out.println(Arrays.asList(arr));
    }

    @Test
    public void testCase() {
        int[] arr = new int[]{4, 2, 6, 7, 8, 9, 0, 12};
        int[] res = new int[]{12, 0, 9, 8, 7, 6, 2, 4};
        Assertions.assertArrayEquals(res, reverseArray(arr, 0, arr.length - 1));
    }

    @Test
    public void testCaseWithOutRecursionUsingSapping() {
        int[] arr = new int[]{4, 2, 6, 7, 8, 9, 0, 12};
        int[] res = new int[]{12, 0, 9, 8, 7, 6, 2, 4};
        Assertions.assertArrayEquals(res, reverseArrayUsingSwapping(arr));
    }

    private int[] reverseArrayUsingSwapping(int[] arr) {

        int temp;
        int end = arr.length - 1;

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[end - i];
            arr[end - i] = temp;
        }
        return arr;
    }


}
