package stringDemo;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String str = "Remove white space from string";

        System.out.println(str.replaceAll("\\s+", ""));

        System.out.println(Day.MON.equals(Month.APR));


    }

    public enum Day {
        MON,
        TUE,
        WED,
        THU,
        FRI,
        SAT,
        SUN
    }
    public enum Month {
        JAN,
        FEB,
        MAR,
        APR,
        MAY,
        JUN,
        JULY
    }
}
