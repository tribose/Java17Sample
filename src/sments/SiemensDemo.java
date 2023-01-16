package sments;

import java.util.LinkedHashMap;
import java.util.Map;

public class SiemensDemo {

    /*

    Write the function getFirstNonRepeatedChar() which takes a string
    parameter named str, and returns the first non-repeated character
    of the string.Example Inputs/Outputs:“string” returns ‘s’“abcdeab” returns ‘c’
     */

    public static void main(String[] args) {
        SiemensDemo siemensDemo = new SiemensDemo();

        String input = "abcdeab";
        System.out.println(siemensDemo.getFirstNonRepeatedChar(input));


    }

    public char getFirstNonRepeatedChar(String input) {

        char[] chars = input.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch: chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char ch = '\0';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                ch = entry.getKey();
                break;
            }

        }
        return ch;
    }
}
