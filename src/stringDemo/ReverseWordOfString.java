package stringDemo;

public class ReverseWordOfString {

    public static void main(String[] args) {
        String s1 = "Java is best";

        String[] words = s1.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0 ; i--) {
            sb.append(words[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
