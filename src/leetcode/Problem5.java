package leetcode;

import java.util.StringJoiner;

public class Problem5 {

    public static String reverseWords(String S)
    {
        String[] split = S.split("[.]");
        int len = split.length;
        String result = "";
        for(int i = len - 1; i >= 0 ; i--) {

            String word = split[i];
            StringBuilder builder = new StringBuilder(word);
            String reversedWord = builder.reverse().toString();
            result += reversedWord + ".";
        }
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));
    }
}
