package hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John");
        Employee emp2 = new Employee(2, "Maya");
        Employee emp3 = new Employee(3, "Abhi");
        Employee emp4 = new Employee(4, "Jocker");
        Employee emp5 = new Employee(5, "Amy");
        Employee emp6 = new Employee(6, "Hitesh");
        Employee emp7 = new Employee(7, "Sabana");
        Employee emp8 = new Employee(8, "Sharukh");


        Map<Employee, String> map = new HashMap<>();

        map.put(emp1, "CSE");
        map.put(emp2, "MECH");

        System.out.println(map.get(emp1));
        System.out.println(map.get(emp2));

        for (Map.Entry<Employee, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "<>" + entry.getValue());
        }

        List<Employee> employeeList = List.of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8);

        employeeList = employeeList.stream().sorted(Comparator.comparing(Employee::getName)).toList();

        employeeList.forEach(e -> System.out.println(e.getName()));

        Map<String, Integer> originalMap5 = new HashMap<>();
        originalMap5.put("a", 1);
        originalMap5.put("b", 2);
        originalMap5.put("c", 3);

        System.out.println(originalMap5);
        Map<String, Integer> integerMap = Map.copyOf(originalMap5);

        originalMap5.put("d", 4);

        System.out.println(originalMap5);


    }
}
