package leethCode.O1slidingWindowProblem;


// time complexity: O(n)

import java.util.*;

public class  O6SlidingWindowMaximumInAllSequence {

    private static List<Integer> getMaxSlidWindow(int[] arr, int k) {

        List<Integer> sumOfSlidinList = new ArrayList<>();
        List<Integer> ResultOfMaxSlingWindow = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sumOfSlidinList.add(arr[i]);
            if (i >= k - 1) {
                Integer max = Collections.max(sumOfSlidinList);
                ResultOfMaxSlingWindow.add(max);
                sumOfSlidinList.remove(0);
            }
        }
        return ResultOfMaxSlingWindow;
    }


    private static int[] getMaxSlidingWindow(int[] arr, int k) {

        List<Integer> sumOfSlidinListofSizeK = new ArrayList<>();
        int[] result = new int[arr.length-k+1];
        int indexCount=0;

        for (int i = 0; i < arr.length; i++) {
            sumOfSlidinListofSizeK.add(arr[i]);
            if (i >= k - 1) {
                Integer max = Collections.max(sumOfSlidinListofSizeK);
                result[indexCount++]=max;
                sumOfSlidinListofSizeK.remove(0);
            }
        }
        return result;
    }


    private static List<Integer> getMaxSlidWindowUsingQueue(int[] arr, int k) {

        Queue<Integer> sumOfSlidinList = new LinkedList<>();
        List<Integer> ResultOfMaxSlingWindow = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sumOfSlidinList.offer(arr[i]);
            if (i >= k - 1) {
                Integer max = Collections.max(sumOfSlidinList);
                ResultOfMaxSlingWindow.add(max);
                sumOfSlidinList.poll();
            }
        }
        return ResultOfMaxSlingWindow;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        List maxWindow = getMaxSlidWindow(arr, k);
        System.out.println(maxWindow);

        /// int

        int[] result = getMaxSlidingWindow(arr, k);
        for (int e: result) {
            System.out.print(e +",");
        }

        // queue

        List resultFromQueue = getMaxSlidWindowUsingQueue(arr, k);
        System.out.println();
        System.out.println(resultFromQueue);
    }

}
