package stringDemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseString {

    public static void main(String[] args) {
        String s = "Intellij";

        char[] sChar = new char[s.length()];

        Deque<Character> characters = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            characters.push(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            sChar[i] = characters.pop();
        }

        System.out.println(String.valueOf(sChar));
    }
}
