package stream;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStream {

    public static void main(String[] args) {
        String[] stringArray = {"Amit", "Bala", "Amit", "Roshan", "Bobby"};

        //Stream<String> inputStream =  Arrays.asList(stringArray).stream();

        Supplier<Stream<String>> inputStream = () -> Stream.of(stringArray);

        inputStream.get().forEach(System.out::println);

        long result = inputStream.get().filter(e -> "Amit".equals(e)).count();

        System.out.println(result);

    }
}
