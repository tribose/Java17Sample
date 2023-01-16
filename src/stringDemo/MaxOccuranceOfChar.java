package stringDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaxOccuranceOfChar {

    static final int ASCII_SIZE = 90;
    public static void main(String[] args) {
        String s1 = "The only way out of this tunnel is to break the walls";

        char[] chars = s1.toCharArray();

        Set<Character> charSet = new HashSet<>(s1.length());
        Map<Character, Integer> charMap = new HashMap<>();

        for (char ch: chars) {
            if (!charSet.add(ch)) {
                charMap.put(ch, charMap.containsKey(ch) ? charMap.get(ch) + 1 : 2);
            }
        }

        int iCount = 0;
        Character c = null;
        for (Map.Entry<Character, Integer> entry: charMap.entrySet()) {
            int count = entry.getValue();
            if (count >= iCount) {
                iCount = count;
                c = entry.getKey();

            }
        }


        System.out.println((char)c);

        int count[] = new int[ASCII_SIZE];

        // Construct character count array from the input
        // string.
        int len = s1.length();
        for (int i = 0; i < len; i++)
            count[s1.charAt(i)]++;

        System.out.println(count);
    }
}
