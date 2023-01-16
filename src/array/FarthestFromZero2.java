package array;

import java.util.TreeSet;

public class FarthestFromZero2 {

    public static void main(String[] args) {

        int [] arr = {-10, -11, 1, 2, 10, 0, 11};

        TreeSet<Integer> integers = new TreeSet<>();

        for (Integer element : arr) {
            integers.add(element);
        }

        int min = integers.first();
        int max = integers.last();

        if (Math.abs(min) >= Math.abs(max)) {
            System.out.println(min);
        } else
            System.out.println(max);
    }
}
