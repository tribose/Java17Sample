package stringDemo;

public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.convertRomanToInteger("XI"));
    }

    int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    private int convertRomanToInteger(String number) {
        int total = 0;

        for (int i = 0; i < number.length(); i++) {
            int s1 = value(number.charAt(i));

            if (i + 1 < number.length()) {
                int s2 = value(number.charAt(i + 1));

                if (s1 >= s2) {
                    total = total + s1;
                } else {
                    total = total - s1;
                }
            } else {
                total = total + s1;
            }
        }
        return total;
    }
}
