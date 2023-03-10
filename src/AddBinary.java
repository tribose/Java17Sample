public class AddBinary {
    // This function adds two
    // binary strings and return
    // result as a third string
    static String addBinary(String a, String b)
    {

        // Initialize result
        StringBuilder result = new StringBuilder("");

        // Initialize digit sum
        int s = 0;

        // Traverse both strings starting
        // from last characters
        int i = a.length() - 1, j = b.length() - 1;
        System.out.println(a+" <> "+b);
        while (i >= 0 || j >= 0 || s == 1)
        {

            // Comput sum of last
            // digits and carry
            System.out.println("A :"+a.charAt(i));
            System.out.println(a.charAt(i) - '0');
            s += ((i >= 0)? a.charAt(i) - '0': 0);
            System.out.println("s1 = "+s );
            System.out.println("B :"+a.charAt(j));
            System.out.println(a.charAt(j) - '0');
            s += ((j >= 0)? b.charAt(j) - '0': 0);
            System.out.println("s2 = "+s );
            // If current digit sum is
            // 1 or 3, add 1 to result
            result.append((char)(s % 2 + '0'));

            // Compute carry
            s /= 2;

            // Move to next digits
            i--; j--;
        }

        // Remove leading zeros, if any
        int start = result.length()-1;

        while(start >=0 && result.charAt(start) == '0') {
            start--;
        }

        if(start != result.length()-1) {
            result.delete(start+1,result.length());
        }

        return result.reverse().toString();
    }

    //Driver code
    public static void main(String args[])
    {
        String a = "1101", b="100";

     //   System.out.print(addBinary(a, b));
        char ch = '1';
        char chb = '0';
        System.out.println(ch);
        System.out.println(chb);
        System.out.println(ch + chb);
        System.out.println(ch - chb);
        System.out.println(chb - ch);
    }
}
