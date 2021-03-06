/*
 * Given two arrays of integers, find a pair of values (one value from each array)
 * that you can swap to give the two arrays the same sum, if you can't find the pair, return null;
 */
package zoomInt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TestSumSwap {

    public static void main(String[] args) {
        int[] firstArray = {4, 1, 2, 1, 1, 2};
        int[] secondArray = {3, 6, 3, 5};

        int[] result = findSwapValues(firstArray, secondArray);
        System.out.println(Arrays.toString(result));

    }

    public static boolean returnTrueIfSumsAreEqual(int[] firstArray, int[] secondArray) {
        int firstSum = IntStream.of(firstArray).sum();
        int secondSum = IntStream.of(secondArray).sum();
        return ((firstSum - secondSum) == 0);
    }


    private static int[] findSwapValues(int[] firstArray, int[] secondArray) {
        int elementInFirstArray = 0;
        Map<Integer, Boolean> visitedFirstArray = new HashMap<>();

        if (returnTrueIfSumsAreEqual(firstArray, secondArray)) return new int[]{};

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {

                int[] copyFirst = Arrays.copyOf(firstArray, firstArray.length);
                if(!visitedFirstArray.containsKey(copyFirst[i])) {
                    visitedFirstArray.put(copyFirst[i], true);
                } else {
                    i++;
                }

                elementInFirstArray = copyFirst[i];
                int[] copyOfSecond = Arrays.copyOf(secondArray, secondArray.length);

                copyFirst[i] = copyOfSecond[j];
                copyOfSecond[j] = elementInFirstArray;
                if (returnTrueIfSumsAreEqual(copyFirst, copyOfSecond)) {
                       return new int[]{copyOfSecond[j], copyFirst[i]};
            }
        }
    }
        return new int[]{};
}
/// code goes here

    @Test
    public void test_when_equal_sums_found() {

        int[] firstArray = {4, 1, 2, 1, 1, 2}; // 11 /// 11+3 = 14
        int[] secondArray = {3, 6, 3, 5};   // 17 //-3 = 14
        Assertions.assertArrayEquals(new int[]{2, 5}, findSwapValues(firstArray, secondArray));
    }

    @Test
    public void test_when_empty_array() {
        Assertions.assertArrayEquals(new int[]{}, findSwapValues(new int[]{}, new int[]{}));
    }

    @Test
    public void test_when_equal_sums_not_found() {

        int[] firstArray = {4,20};
        int[] secondArray = {3, 6, 3};
        Assertions.assertArrayEquals(new int[]{}, findSwapValues(firstArray, secondArray));
    }

}