package pathsala;

//https://leetcode.com/problems/trapping-rain-water/

//https://leetcode.com/problems/trapping-rain-water/submissions/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrappingRainWater {

    public int trap(int[] height) {

        int[] prefixMax = prefixMax(height);
        int[] suffixMax = suffixMax(height);
        int sumOfTrappedWater=0;
//        System.out.println(Arrays.toString(height));
//        System.out.println("-----");
//        System.out.println(Arrays.toString(prefixMax));
//        System.out.println("-----");
//        System.out.println(Arrays.toString(suffixMax));

        for(int i =1; i<height.length-1; i++) {
            int waterTrapped = Math.min(prefixMax[i], suffixMax[i]) - height[i];
                sumOfTrappedWater=sumOfTrappedWater+waterTrapped;
        }
        return sumOfTrappedWater;
    }

    public int[] prefixMax(int[] height) {
        int[] prefixMax = height.clone(); //new int[height.length];
        int max = height[0];

        for (int i = 1; i < height.length; i++) {
            max = Math.max(height[i], max);
            prefixMax[i] = max;
        }
        return prefixMax;
    }

    public int[] suffixMax(int[] height) {
        int[] suffixMax = height.clone(); //new int[height.length];
        int max = height[height.length-1];

        for (int i = height.length - 1; i >= 0; i--) {
            max = Math.max(height[i], max);
            suffixMax[i] = max;
        }
        return suffixMax;
    }

    @Test
    public void test() {
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = 6;
        Assertions.assertEquals(result, trap(height));
    }

    @Test
    public void test2() {
        int[] height = new int[]{4,2,0,3,2,5};
        int result = 9;

        Assertions.assertEquals(result, trap(height));
    }


}
