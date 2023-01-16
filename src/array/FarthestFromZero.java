package array;

import java.util.Arrays;
import java.util.TreeSet;

public class FarthestFromZero {

    public static void main(String[] args) {
        int [] arr = {-10, -11, 1, 2, 10, 0, 12};

        TreeSet<Integer> ts = new TreeSet<>();
        Arrays.stream(arr).forEach(ts::add);

        /*for (int value : arr) {
            ts.add(value);
        }*/

        int minValue = ts.first();
        int maxValue = ts.last();

        if (Math.abs(minValue) >= Math.abs(maxValue))
            System.out.println(minValue);
        else
            System.out.println(maxValue);
    }
}
