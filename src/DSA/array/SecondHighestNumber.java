package DSA.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondHighestNumber {

    public static void main(String[] args) {
        int[] arr = {10, 6, 20, 5, 4, 50, 100, 80};
        OptionalInt result = Arrays.stream(arr)
                .distinct()
                .sorted().skip(1).findFirst();
        if (result.isPresent())
            System.out.println(result.getAsInt());

    }
}
