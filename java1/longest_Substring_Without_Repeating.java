import java.util.HashMap;

public class longest_Substring_Without_Repeating {
    public String longestSubstringWithoutRepeating(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int left = 0, maxLength = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            if (seen.containsKey(letter) && seen.get(letter) >= left) {
                left = seen.get(letter) + 1;
            } else {
                if (i - left + 1 > maxLength) {
                    maxLength = i - left + 1;
                    start = left;
                }
            }

            seen.put(letter, i);
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        longest_Substring_Without_Repeating sol = new longest_Substring_Without_Repeating();
        String input = "abcabcbb";
        String result = sol.longestSubstringWithoutRepeating(input);
        System.out.println(result);
    }
}
