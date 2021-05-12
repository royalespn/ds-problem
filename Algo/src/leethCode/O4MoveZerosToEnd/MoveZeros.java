package leethCode.O4MoveZerosToEnd;


///iman solution :-)

//time complexity O(n)

public class MoveZeros {

    private static int[] moveZeros(int[] arr) {


        int[] res = new int[arr.length];
        int index=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                res[index++] = arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 5, 7, 11, 0, 12};

        int[] result = moveZeros(arr);

        for (int e : result) {
            System.out.print(e + ",");
        }
    }
}
