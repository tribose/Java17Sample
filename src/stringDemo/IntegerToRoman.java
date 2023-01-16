package stringDemo;

public class IntegerToRoman {

    public static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static final String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static void main(String[] args) {
        int input = 36;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (input >= values[i]) {
                input = input - values[i];
                System.out.println(input + "<>" +i + "<>" + romanLetters[i]);
                stringBuilder.append(romanLetters[i]);
            }
        }
        System.out.println(stringBuilder);
    }
}
