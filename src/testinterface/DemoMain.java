package testinterface;

import java.util.*;
import java.util.stream.Collectors;

public class DemoMain {
    public static void main(String[] args) {
        TestAbstract testAbstract = new TestInterfaceImpl1("my description");
        System.out.println(testAbstract.getDescription());

        Map<String,Integer> newPhoneBook = new HashMap<>(){{
            putIfAbsent("Arpan",80186787);
            putIfAbsent("Sanjay",80186788);
            putIfAbsent("Kiran",80186789);
            putIfAbsent("Pranjay",80186790);
            putIfAbsent("Jaiparkash",80186791);
            putIfAbsent("Maya",80186792);
            putIfAbsent("Rythem",80186793);
            putIfAbsent("Preeti",80186794);

        }};

        Map<String, Integer> map10 = new HashMap<>(){{putIfAbsent("deno10", 10);}};
        Map<String, Integer> map100 = new HashMap<>(){{putIfAbsent("deno100", 5);}};

        List<Map<String, Integer>> listDeno = Arrays.asList(map10, map100);



        System.out.println(newPhoneBook);

        String str1 = newPhoneBook
                .entrySet()
                .stream()
                .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(",", "{", "}"));

        String str2 = newPhoneBook
                .entrySet()
                .stream()
                .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(",", "{", "}"));

        StringJoiner joiner = new StringJoiner(",", str1, str2);
        System.out.println(joiner);
    }
}
