/*
package pragramPathSala;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationEAsy {

    public List<Integer> generatePermutation(int[] num, int numberToAdd) {

        List<Integer> ComputedArray = new ArrayList<>();
        List<Integer> number = new ArrayList<>();

        for (Integer i : num) {
            number.add(i);
        }

        //K+1
        int indexOfNewNumber=0;
        for(int i=0; i<=num.length; i++){

            if(indexOfNewNumber==0){
                ComputedArray.add(numberToAdd);
                ComputedArray.add((number));
            }


            int[] x = new int[num.length+1];


            ComputedArray.add();
        }



        return ComputedArray;
    }


    @Test
    public void test() {


        int[] num = {2, 3};
        int numberToAdd = 1;
        List<Integer> received = generatePermutation(num, numberToAdd);
        List<Integer> result = new ArrayList<>();
        result.add(123);
        result.add(213);
        result.add(231);
        List<Integer> arrayList = Arrays.asList(new Integer[]{123, 213, 231});


        Assertions.assertEquals(received, arrayList);
    }
}
*/
