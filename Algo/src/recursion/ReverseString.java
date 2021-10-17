package recursion;

public class ReverseString {

    private static int i = 0;

    public static void main(String args[]) {
        String finalResult = reverse("HELO");
        System.out.println("Final CAll: " + finalResult);
    }

    public static String reverse(String str) {
        int localI = i++;
        if ((null == str) || (str.length()  < 1)) {
            return str;
        }
        System.out.println("Step " + localI + ": " + str.substring(1) + " / " + str.charAt(0));
        String reversed = reverse(str.substring(1)) + str.charAt(0);

        System.out.println("---------------------------");

        System.out.println("Step " + localI + " returns: " + reversed);
        return reversed;
    }
}
