package DSA.array;

import java.util.HashSet;
import java.util.Set;
/*
Find the first repeating element in an array of integers
 */
public class FirstRepeatingInteger {

    public static void main(String[] args) {
        int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};

        Set<Integer> mySet = new HashSet<>();
        int min = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (mySet.contains(arr[i])) {
                min = i;
            } else {
                mySet.add(arr[i]);
            }
        }

        System.out.println(arr[min]);
    }
}
