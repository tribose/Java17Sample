package hashmap;

import java.util.Objects;

public final class Employee {

    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = new String(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return new String(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (null == obj || (getClass() != obj.getClass())) return false;

        Employee emp = (Employee) obj;
        return this.getId() == emp.getId() && this.getName().equals(emp.getName());
    }
}
