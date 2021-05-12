package leethCode.O4MoveZerosToEnd;


//time complexity O(n)

public class MoveZerosWithOutUsingAnotherArray {

    private static int[] moveZeros(int[] arr) {

        int index=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while(index<arr.length){
            arr[index++] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 5, 7, 11, 0, 12};

        int[] result = moveZeros(arr);

        for (int e : result) {
            System.out.print(e + ",");
        }
    }
}
