package leethCode.O1slidingWindowProblem;

//https://www.youtube.com/watch?v=3IETreEybaA&ab_channel=NickWhiteNickWhiteVerified


import java.util.HashSet;
import java.util.Set;

public class O7LongestSubStringProblem {

    private static int longestSubString(String sentence) {

        int startIndex = 0;
        int endIndex = 0;
        int max = Integer.MIN_VALUE;
        Set<Character> visitedWord = new HashSet<>();

        while (endIndex < sentence.length()) {
            if (!visitedWord.contains(sentence.toCharArray()[endIndex])) {
                visitedWord.add(sentence.toCharArray()[endIndex]);
                max = Math.max(max, visitedWord.size());
                endIndex++;
            } else {
                visitedWord.remove(sentence.toCharArray()[startIndex]);
                startIndex++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String sentence = "abcdbeghef";
        System.out.println(longestSubString(sentence));


        System.out.println(longestSubString("abccc"));
        System.out.println(longestSubString("ab"));
        System.out.println(longestSubString("abcabcabc"));



    }
}
