package stringDemo;

public class RemoveDuplicateChar {

    public static void main(String[] args) {
        System.out.println(removeDuplicateChar("RemoveDuplicateChar"));

    }

    public static String removeDuplicateChar(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (str.indexOf(ch) < 0) {
                str += ch;
            }
        }
        return str;
    }

}
