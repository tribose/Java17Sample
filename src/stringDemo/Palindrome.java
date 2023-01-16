package stringDemo;

public class Palindrome {

    public static void main(String[] args) {
        String s1 = "abbva";

        for (int i = 0; i < s1.length() / 2; i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - 1 - i)) {
                System.out.println("false");
                break;
            }
        }
    }
}
