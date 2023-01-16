package stringDemo;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLength {

    public static void main(String[] args) {
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;

        String s = "geekforgeeks";

        Set<Character> charSet = new HashSet<>();

        while (b_pointer < s.length()) {
            if (!charSet.contains(s.charAt(b_pointer))) {
                charSet.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(charSet.size(), max);
            } else {
                charSet.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }

        System.out.println("max "+max);
    }
}
