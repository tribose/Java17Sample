package ininterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("s3", "s1", "s2");

        List<String> resultList = stringList.stream().sorted().collect(Collectors.toList());

        resultList.forEach(System.out::println);
    }

}
