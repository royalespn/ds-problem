package in.co.iman.O2_findRepeatingCharacter;

//time complexity o(n)

import java.util.HashMap;
import java.util.Map;

public class HashSolution {

    public static void main(String[] args) {

        String str = "Highoogle";
        Character result = check(str);
        System.out.println(result);
    }

    public static Character check(String str) {

        Map<Character, Boolean> visited = new HashMap<>();
        char[] charArr = str.toLowerCase().toCharArray();

        for (char c : charArr) {
            if (visited.containsKey(c))
                return c;
            else
                visited.put(c, true);
        }
        return null;
    }
}
