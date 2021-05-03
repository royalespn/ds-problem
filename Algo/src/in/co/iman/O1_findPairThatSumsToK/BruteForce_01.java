package in.co.iman.O1_findPairThatSumsToK;

//check all pairs (brute force)

// time complexity 0(n2)

public class BruteForce_01 {

    public static void main(String[] args) {

        int[] arr = {4, 12, 5, 7, 2, 10};
        int k = 9;

        boolean result = findPair(arr, k);
        System.out.println(result);
    }

    public static boolean findPair(int[] source, int res) {

        for (int i = 0; i < source.length; i++) {
            for (int j = i + 1; j < source.length; j++) {
                if (source[i] + source[j] == res) {
                    return true;
                }
            }

        }
        return false;
    }
}
