package stringDemo;

public class StringRotation {

    public static void main(String[] args) {
        String s1 = "XYZ";
        String target = "ZXY";
        if (s1.length() != target.length()) {
            System.out.println(false);
        }
        s1 = s1.concat(s1);

        if (s1.indexOf(target) != -1)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
