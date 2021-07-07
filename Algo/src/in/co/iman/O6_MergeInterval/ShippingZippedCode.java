package in.co.iman.O6_MergeInterval;

import org.junit.Assert;
import java.util.*;

public class ShippingZippedCode {

    public static int[][] findZip(int[][] zipCodesRange) {
        List<int[]> zippedCodesThanCanBeShipped = new ArrayList();
        if (zipCodesRange.length <= 1)
            return zipCodesRange;

        Arrays.sort(zipCodesRange, Comparator.comparingInt(i -> i[0]));
        int firstDimention = 1;
        int[] gap = zipCodesRange[0];

        while (firstDimention < zipCodesRange.length) {
            if (gap[1] < zipCodesRange[firstDimention][0]) {
                zippedCodesThanCanBeShipped.add(gap);
                gap = zipCodesRange[firstDimention];
            } else {
                gap[1] = Math.max(gap[1], zipCodesRange[firstDimention][1]);
            }
            firstDimention++;
        }
        zippedCodesThanCanBeShipped.add(gap);

        return zippedCodesThanCanBeShipped.toArray(new int[zippedCodesThanCanBeShipped.size()][]);
    }

    public static void main(String[] args) {

        int[][] zipCode1 = {{94133, 94133}, {94200, 94299}, {94600, 94699}};
        int[][] zipCode2 = {{94133, 94133}, {94200, 94299}, {94226, 94399}};

        Assert.assertEquals(new int[][]{{94133, 94133}, {94200, 94299}, {94600, 94699}}, findZip(zipCode1));
        Assert.assertEquals(new int[][]{{94133, 94133}, {94200, 94399}}, findZip(zipCode2));
    }
}

