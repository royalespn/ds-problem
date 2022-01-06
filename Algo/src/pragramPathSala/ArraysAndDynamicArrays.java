package pragramPathSala;

import java.util.Arrays;

public class ArraysAndDynamicArrays {

    public static void main(String[] args) {
        //   preConputerSum();

        maxElement(new int[]{2, 4, 6, 8, 10, 22, 5, 1});
    }

    private static void preConputerSum() {
        int[] arr = new int[]{2, 4, 6, 8, 10};
        System.out.println("-------------");

        Arrays.stream(arr).forEach(System.out::println);

        for (int i = 1; i < arr.length; i++) {
            System.out.println("---inside method start----------");
            System.out.println("i=:" + i);
            System.out.println("arr[i]=:" + arr[i]);
            System.out.println("arr[i-1]=:" + arr[i - 1]);
            System.out.println("----inside method end---------");
            arr[i] = arr[i] + arr[i - 1];
        }
        System.out.println("-------------");
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void maxElement(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("max:" + max);

    }

}
