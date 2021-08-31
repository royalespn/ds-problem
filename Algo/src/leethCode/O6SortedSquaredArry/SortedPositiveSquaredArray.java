package leethCode.O6SortedSquaredArry;


// https://www.youtube.com/watch?v=4eWKHLSRHPY&list=PLU_sdQYzUj2mE8quVfDEGnupdS7XuU2YW&index=7&ab_channel=NickWhite

import org.junit.Assert;
import org.junit.Test;

public class SortedPositiveSquaredArray {


    private int[] squaredArray(int[] inputArray) {

        int startIndex = 0;
        int endIndex = inputArray.length-1;

        int[] squaredPositiveArray = new int[inputArray.length];
        int squaredIndexPosition = inputArray.length-1;

        for(int i = 0; i<inputArray.length; i++){
            if (Math.abs(inputArray[startIndex]) > inputArray[endIndex]) {
                squaredPositiveArray[squaredIndexPosition--] = inputArray[startIndex]  *  inputArray[startIndex];
                startIndex++;
            }
            else {
                squaredPositiveArray[squaredIndexPosition--] = inputArray[endIndex] *  inputArray[endIndex];
                endIndex--;
            }
        }

        return squaredPositiveArray;
    }

    @Test
    public void test_1() {

        int[] inputArray = new int[]{-4,-3,1,2,5};
        int[] squared = squaredArray(inputArray);
        Assert.assertEquals(squared[0], 1);
        Assert.assertEquals(squared[1], 4);
        Assert.assertEquals(squared[2], 9);
        Assert.assertEquals(squared[3], 16);
        Assert.assertEquals(squared[4], 25);
    }

    @Test
    public void test_2() {

        int[] inputArray = new int[]{-1,2,4,5};
        int[] squared = squaredArray(inputArray);
        Assert.assertEquals(squared[0], 1);
        Assert.assertEquals(squared[1], 4);
        Assert.assertEquals(squared[2], 16);
        Assert.assertEquals(squared[3], 25);
    }
}
