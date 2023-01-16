package treemap;

import java.util.*;

public class TreeMapDemo {

    public static void main(String[] args) {

        Employee emp1 = new Employee(11);
        Employee emp2 = new Employee(10);
        Employee emp3 = new Employee(12);

        Map<Employee, String> treeMap = new TreeMap<>(Comparator.comparing(Employee::getId).reversed());

        treeMap.put(emp1, "MBP");
        treeMap.put(emp2, "ABC");
        treeMap.put(emp3, "GHP");

        System.out.println(treeMap);

        List<String> list = new LinkedList<>();
    }
}
