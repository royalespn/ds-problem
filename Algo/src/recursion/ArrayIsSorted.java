package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayIsSorted {

    public static void main(String[] args) {

    }
    private static boolean isSorted = true;
    private boolean isSorted(int[] arr, int start, int end) {

        if(arr.length <=1) return isSorted;

        if (!(start>=end)) {
            if(arr[start] > arr[start+1]) {
                isSorted = false;
                return false;
            }

            isSorted(arr, start+1, end);
        }

        System.out.println("-----inside---" + isSorted);

       return isSorted;

    }


    @Test
    public void testCase() {
        System.out.println("-----XXXXX-1----");
        int[] arr = new int[]{2,4,6,8,10,12,13};
        Assertions.assertTrue(isSorted(arr, 0, arr.length - 1));

        System.out.println("-----XXXXX-22----");

        int[] arr1 = new int[]{2,4,3,5,9,1};
        Assertions.assertFalse(isSorted(arr1, 0, arr1.length - 1));
        System.out.println("-----XXXXX-3----");

        int[] arr2 = new int[]{5,4,3,1,2,10,12};
        Assertions.assertFalse(isSorted(arr2, 0, arr2.length - 1));
    }
}
