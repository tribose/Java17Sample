package DSA.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
Find first non-repeating element in a given Array of integers
 */
public class FirstNonRepeating {

    public static void main(String[] args) {

        int[] arr = {9, 4, 9, 6, 7, 4};

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> mySet =  map.entrySet();

        for (Map.Entry<Integer, Integer> entry: mySet) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
