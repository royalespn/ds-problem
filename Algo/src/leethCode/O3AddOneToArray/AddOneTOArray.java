package leethCode.O3AddOneToArray;

import java.util.Arrays;

public class AddOneTOArray {


    private static int[] addOnetoArray(int[] arr) {


        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
        }
        int[] result = new int[arr.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 8};
        int[] result = addOnetoArray(arr);
        for (int each : result) {
            System.out.print(each + ",");
        }


        int[] arr1 = {9, 9};
        int[] result1 = addOnetoArray(arr1);
        for (int each : result1) {
            System.out.print(each + ",");
        }

    }
}
