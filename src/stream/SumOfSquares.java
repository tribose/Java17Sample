package stream;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

import static java.util.stream.Collectors.toMap;

public class SumOfSquares {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);

        int sum = list.stream()
                .filter(e -> e % 2 == 0)
                .map( e -> e * e)
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);


        OptionalDouble average = list.stream().mapToInt(e -> e).average();

        System.out.println(average);

        Map<Integer, Integer> result =  list.stream().filter(e -> e % 2 == 0).collect(toMap(
                e -> e,
                e -> e * e
        ));

        System.out.println(result);
    }
}
