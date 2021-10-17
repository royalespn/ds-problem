package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayIsSorted_2_Imp {

    private boolean isSorted(int[] arr, int start) {

        if (start == arr.length - 1)
            return true;

        if(arr[start] > arr[start+1]) {
            return false;
        }
        System.out.println("---------Inside--------");
       return isSorted(arr, start+1);
    }

    @Test
    public void testCase() {
        System.out.println("-----XXXXX-1----");
        int[] arr = new int[]{2, 4, 6, 8, 10, 12, 13};
        Assertions.assertTrue(isSorted(arr, 0));

        System.out.println("-----XXXXX-22----");
        int[] arr1 = new int[]{2, 4, 3, 5, 9, 1};
        Assertions.assertFalse(isSorted(arr1, 0));

        System.out.println("-----XXXXX-3----");
        int[] arr2 = new int[]{5, 4, 3, 1, 2, 10, 12};
        Assertions.assertFalse(isSorted(arr2, 0));

        System.out.println("-----XXXXX-4----");
        int[] arr3 = new int[]{3, 4, 5, 6, 7, 10, 2};
        Assertions.assertFalse(isSorted(arr3, 0));
    }
}
