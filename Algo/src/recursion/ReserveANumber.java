package recursion;

public class ReserveANumber {


    private static int reverseNumber(int num) {

        if (num < 10) {
            System.out.println(num);
            return num;
        }

        System.out.println(num % 10);
        reverseNumber(num / 10);
        return num;
    }

    public static void main(String[] args) {
        reverseNumber(123456);
    }
}
