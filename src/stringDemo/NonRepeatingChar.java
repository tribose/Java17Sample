package stringDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChar {

    public static void main(String[] args) {
        String s1 = "Java";

        Map<Character, Integer> integerMap = new LinkedHashMap<>();

        char[] chars = s1.toCharArray();

        for (char ch: chars) {
            integerMap.put(ch, integerMap.containsKey(ch) ? integerMap.get(ch) + 1 : 1);
        }

        for (Map.Entry<Character, Integer> entry: integerMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
