package treemap;

import java.util.LinkedList;
import java.util.List;

public class Employee /*implements Comparable<Employee>*/{

    List<Integer> list = new LinkedList();
    private int id;

    public Employee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*@Override
    public int compareTo(Employee obj) {
        return obj.id - this.id;
    }
*/
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }
}
