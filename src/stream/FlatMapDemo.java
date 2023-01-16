package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String[] args) {
        String[][] myArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f", "g"}};

        List<String> strArr = Arrays.stream(myArray).flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());

        System.out.println(strArr);
    }
}
