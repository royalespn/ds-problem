package recursion;

public class O3_print_1_to_N_Using_Recirsion {

    public static void main(String[] args) {
        print1toN(7);
    }

    public static void print1toN(int n) {

        if(n==0) return ;

        print1toN(n-1);
        System.out.printf(" " + n );
    }

}
