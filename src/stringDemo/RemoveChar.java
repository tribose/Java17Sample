package stringDemo;

// remove chars from str1 which are in str2

public class RemoveChar {

    public static void main(String[] args) {
        String str1, str2;
        str1 = "geeksforgeeks";
        str2 = "mask";

        removeChar(str1, str2);
    }

    private static void removeChar(String str1, String str2) {
        for (int index = 0; index < str2.length(); index++) {
            char ch = str2.charAt(index);

            if (str1.contains(ch + "")) {
                str1 = str1.replaceAll((ch + ""), "");
            }
        }
        System.out.println(str1);
    }
}
