package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FindMaximumElementInArray {


    private int[] sortArray(int[] arr, int start, int len) {

        if (len == 0) return arr;

        int temp = arr[start];

        if(arr[start]>arr[start+1]){
            arr[start] = arr[start+1];
            arr[start+1] = temp;
        }
        sortArray(arr,start+1, len-1);

        return arr;
    }



    @Test
    public void test() {
        int[] arr = new int[]{5,3,6,7,1,4};
        int[] sortedArr = new int[]{1,3,4,5,6,7};

        System.out.println(Arrays.asList(sortArray(arr, 0,arr.length-1)[arr.length-1]));

        int max = sortArray(arr, 0,arr.length-1)[arr.length-1];

        Assertions.assertEquals(7, max);
    }
}
