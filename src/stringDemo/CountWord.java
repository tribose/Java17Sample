package stringDemo;

public class CountWord {

    public static void main(String[] args) {
        String str = "Java is a great language" +
                "and it is good";
        if (str == null || str.isEmpty()) System.out.println("false");
        String[] words = str.split(" ");
        System.out.println(words.length);
    }
}
