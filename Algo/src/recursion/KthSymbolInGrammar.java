package recursion;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//https://leetcode.com/problems/k-th-symbol-in-grammar/

//https://www.youtube.com/watch?v=qFZFWfrP-IY&ab_channel=AlgoAndroid
public class KthSymbolInGrammar {

    public int kthGrammar(int n, int k) {
        if(n==1 || k==1)
            return 0;

        int mid = (int)Math.pow(2, n-1)/2;

        if(k<=mid){
            return kthGrammar(n-1, k);
        } else {
            return kthGrammar(n-1, k-mid)^1;
        }

    }

    @Test
    public void test() {

        Assertions.assertEquals(1,kthGrammar(2,2));
        Assertions.assertEquals(0,kthGrammar(2,1));
        Assertions.assertEquals(0,kthGrammar(3,1));
    }
}
