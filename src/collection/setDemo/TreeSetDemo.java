package collection.setDemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        Employee e1 = new Employee("emp1", 10);
        Employee e2 = new Employee("emp4", 15);
        Employee e3 = new Employee("emp3", 5);
        Employee e4 = new Employee("emp2", 11);

//        Set<Employee> mySet = new TreeSet<>();


  //      System.out.println(mySet);

        Set<Employee> mySet = new TreeSet<>(Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getAge));
        mySet.add(e1);
        mySet.add(e2);
        mySet.add(e3);
        mySet.add(e4);

        System.out.println(mySet);
    }
}
