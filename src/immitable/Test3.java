package immitable;

import java.util.*;

public class Test3 {

    public static void main(String[] args) {
        Map<String, Integer> originalMap5 = new HashMap<>();
        originalMap5.put("a", 1);
        originalMap5.put("b", 2);
        originalMap5.put("c", 3);

        System.out.println(originalMap5);
        Map<String, Integer> immutableMap = Map.copyOf(originalMap5);
        System.out.println(immutableMap);

        originalMap5.put("d", 4);

        System.out.println(immutableMap);


        //*********************************

        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);

        System.out.println("Before : " + numbers);

        // Sorting an ArrayList using Collections.sort() method
        Collections.sort(numbers, Comparator.reverseOrder());

        System.out.println("After : " + numbers);
    }
}
