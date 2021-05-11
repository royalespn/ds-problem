package leethCode.O2BinarySearch;

//Implement a binary search

// Time complexity O(log n)

import org.junit.Assert;

public class BinarySearch {


    private static int binarySearch(int[] arr, int itemSearch) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if(itemSearch == arr[mid]){
                return mid;
            }
            else if (itemSearch < arr[mid]) {
                right = mid-1;
            } else if(itemSearch > arr[mid]){
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 8, 10, 15, 20, 22,27};
        int itemSearch = 20;
        int result = binarySearch(arr, itemSearch);
        System.out.println(result);

    }


}
