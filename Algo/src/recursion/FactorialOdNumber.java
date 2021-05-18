package recursion;


/* Find factorial of a number using
 *  1. Recursion function
 *  2. Optimal-recursive funtion (using accumulator)
 * */

import java.time.Instant;

public class FactorialOdNumber {


    private static int optimalRecursiveFunction(int n) {

        return findRecursionWithAccumulation(1, n);
    }

    private static int findRecursionWithAccumulation(int accu, int n) {

        //base case
        if (n == 1) return accu;

        return findRecursionWithAccumulation(n * accu, n - 1);
    }

    private static int recursiveFunction(int n) {

        //base case
        if (n == 1) return 1;

        return n * recursiveFunction(n - 1);
    }

    public static void main(String[] args) {

        int recursiveNumber = 5;

        System.out.println("Recursion function: " + recursiveFunction(recursiveNumber));

        System.out.println("Optimal-recursive funtion (using accumulator): " + optimalRecursiveFunction(recursiveNumber));
    }
}
