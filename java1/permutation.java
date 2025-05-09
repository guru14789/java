import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        String input = "abc";
        ArrayList<String> result = new ArrayList<>();

        generatePermutations(input, "", result);

        for (String s : result) {
            System.out.println(s);
        }
    }

    public static void generatePermutations(String str, String prem, ArrayList<String> result) {
        if (str.isEmpty()) {
            result.add(prem);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String curr = "" + str.charAt(i);
            String remainingStr = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remainingStr, prem + curr, result);
        }
    }
}
