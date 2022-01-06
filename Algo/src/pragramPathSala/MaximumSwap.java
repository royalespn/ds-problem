package pragramPathSala;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumSwap {


    int maxValue = Integer.MIN_VALUE;
    int maxIndex;
    int count = 0;


    public int maximumSwap1(int num) {

        char[] number = String.valueOf(num).toCharArray();
        for (Character ch : number) {

            int c = Integer.parseInt(ch.toString());
          //  System.out.println(c);
                if (c!=9 && c >= maxValue) {
                    maxValue = c;
                    maxIndex = count;
                }
            count++;
        }
        System.out.println("after swap 1: " + new String(number));

        System.out.println("Max value" + maxValue);
        System.out.println("Max Index" + maxIndex);

      int count = 0;
        for (Character ch : number) {

            int c = Integer.parseInt(ch.toString());
            System.out.println("value c: "+c);
            if(c < maxValue && maxIndex>count) {
                //swap
                char temp = ch;
                number[maxIndex] = temp;
                number[count] = (maxValue+"").charAt(0);
                break;
            }
            count++;
        }



        System.out.println("after swap 2: " + new String(number));

        return Integer.parseInt(new String(number));

    }

    public int maximumSwap(int num) {

        int maxValue = Integer.MIN_VALUE;
        int maxIndex = 0;
        int count = 0;
        int i = 0;

        int[] number = new int[String.valueOf(num).length()];
        char[] xd = String.valueOf(num).toCharArray();

        for (Character ch : xd) {
            int c = Integer.parseInt(ch.toString());
            number[count++] = c;
        }

        for (i = 0; i < number.length; i++) {

            for (int j = i + 1; j < number.length; j++) {
                System.out.println("...each: " + number[j]);
                if (number[j] >= maxValue) {
                    maxValue = number[j];
                    maxIndex = j;
                }
            }

            System.out.println("Max value:" + maxValue);
            System.out.println("Max Index:" + maxIndex);

            if (number[i] < maxValue && maxIndex > i) {
                int temp = number[i];
                number[i] = maxValue;
                number[maxIndex] = temp;
              //  break;
            }
        }
        StringBuilder s = new StringBuilder();
        for (int res : number) {
            s.append(res);
        }
        return Integer.parseInt(s.toString());
    }


    @Test
    public void test() {
        System.out.println("The input:"+2736);
        int result = maximumSwap(2736);
        Assertions.assertEquals(7236, result);

        System.out.println("The input:"+9973);
        int result1 = maximumSwap(9973);
        Assertions.assertEquals(9973, result1);

        System.out.println("The input:"+19);
        int result4 = maximumSwap(19);
        Assertions.assertEquals(91, result4);
/*
        System.out.println("The input:"+98368);
        int result3 = maximumSwap(98368);
        Assertions.assertEquals(98863, result3);*/
    }

}
