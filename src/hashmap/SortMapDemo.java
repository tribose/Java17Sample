package hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapDemo {

    public static void main(String[] args) {
        EmployeeTwo emp1 = new EmployeeTwo(100);
        EmployeeTwo emp2 = new EmployeeTwo(50);
        EmployeeTwo emp3 = new EmployeeTwo(110);

        Map<EmployeeTwo, String> map = new TreeMap<>(Comparator.comparing(EmployeeTwo::getEmployeeId).reversed());
        map.put(emp1, "e1");
        map.put(emp2, "e2");
        map.put(emp3, "e3");

        //System.out.println(map);

        Map<EmployeeTwo, String> map2 = new HashMap<>();
        map2.put(emp1, "e1");
        map2.put(emp2, "e2");
        map2.put(emp3, "e3");

        System.out.println(map2);

        Map<EmployeeTwo, String> treeMap2 = new TreeMap<>(map2);

        System.out.println(treeMap2);
    }
}
