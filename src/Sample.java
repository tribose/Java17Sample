import java.util.*;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        List<String> integersAsString = Arrays.asList("1", "2", "3");
        List<Integer> ints = integersAsString.stream().map(Integer::parseInt).toList();
        List<Integer> intsEquivalent = integersAsString.stream().map(Integer::parseInt).toList();
        System.out.println(intsEquivalent);

        Book book = new Book("Moonlight", "A. K. Gorge", "ISBN-123-123");

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        OptionalInt anInt = numbers.stream().mapToInt(x -> x).min();
        System.out.println(anInt.getAsInt());
        IntSummaryStatistics statistics =  numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(statistics.getMin());

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        List<MyInteger> myIntegers = new ArrayList<>();

        myIntegers.add(new MyInteger(1, "willi"));
        myIntegers.add(new MyInteger(2, "mike"));
        myIntegers.add(new MyInteger(3, "luke"));
        myIntegers.add(new MyInteger(3, "dustin"));

        Map<Integer, String> resultMap = myIntegers
                .stream()
                .sorted(Comparator.comparing(MyInteger::getName))
                .collect(Collectors.toMap(
                MyInteger::getId,
                MyInteger::getName,
                (oldValue, newValue) -> newValue,
                LinkedHashMap::new));

        System.out.println(resultMap);
    }

    public static class MyInteger {

        private Integer id;
        private String name;

        public MyInteger(Integer id, String name)
        {
            this.id = id;
            this.name = name;
        }

        public Integer getId() { return this.id; }

        public String getName() {
            return name;
        }
        // the .toString method of Object class
        // will be called by default when the object
        // of integer class will be made
        public String toString()
        {
            return "[" + this.id + "=>" + this.name + "]";
        }
    }
}
