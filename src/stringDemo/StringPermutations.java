package stringDemo;

public class StringPermutations {

    public static void main(String[] args) {
        permutation("123");
    }

    public static void permutation(String word) {
        permutation("", word);
    }

    private static void permutation(String perm, String word) {
        if (word.length() == 0) {
            System.out.println(perm + " ");
        }
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            String left_substring = word.substring(0, i);
            String right_substring = word.substring(i+1);
            String rest = left_substring + right_substring;

            permutation(perm + ch, rest);
        }

    }
}
