package recursion;

/* https://www.youtube.com/watch?v=uAWxDcFaVwc&ab_channel=TrainingMug
 *
 * GCD can be done by using either substitution or multiplicatin/modulas recursive call
 *
 * Subtraction Euclidean : time complexity is O(n)
 * Multiplication Euclidean : time complexity is O(log(a + b))
 *
 * */


public class O2_GCD {

    private static int gcdSub(int a, int b) {

        if (a == 0 || b == 0) return 0;

        if (a == b) return a;

        if (a > b) return gcdSub(a - b, b);
        else return gcdSub(a, b - a);
    }

    private static int gcdDivide(int a, int b) {

        //trying to make a==0 and in that case we can get the gcd from b value
        if (a == 0) return b;

        return gcdDivide(b % a, a);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int gcdSubs = gcdSub(a, b);

        int gcdDivide = gcdDivide(a, b);

        System.out.println("GCD substraction:" + gcdSubs);
        System.out.println("GCD divide/modulus:" + gcdDivide);
    }
}
