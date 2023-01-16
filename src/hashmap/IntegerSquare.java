package hashmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerSquare {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 2, 4, 5, 6, 7, 8, 19);

        System.out.println(list.stream()
                .filter(e -> e%2 == 0)
                .map(e -> e * e)
                .collect(Collectors.toList()));

    }

}
