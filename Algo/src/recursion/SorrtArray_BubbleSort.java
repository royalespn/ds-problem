package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SorrtArray_BubbleSort {


    private int[] sortArray(int[] arr, int len) {

        if (len == 1) return arr;

        for (int i = 0; i < len - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            sortArray(arr, len - 1);
        }
        System.out.println("--Iteration--");
        System.out.println(Arrays.toString(arr));
        return arr;
    }


    @Test
    public void test() {
        int[] arr = new int[]{5, 3, 6, 7, 1, 4};
        int[] sortedArr = new int[]{1, 3, 4, 5, 6, 7};

        Assertions.assertArrayEquals(sortedArr, sortArray(arr, arr.length));
    }
}
