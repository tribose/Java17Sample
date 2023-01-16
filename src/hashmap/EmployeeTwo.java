package hashmap;

public class EmployeeTwo implements Comparable<EmployeeTwo> {

    private int employeeId;

    public EmployeeTwo(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int compareTo(EmployeeTwo emp) {
        return this.getEmployeeId() - emp.getEmployeeId();
    }

    @Override
    public String toString() {
        return "EmployeeTwo{" +
                "employeeId=" + employeeId +
                '}';
    }
}
