package multithreading;

public class Employee {
        private String empName;
        private int empId;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Employee emp = (Employee) obj;
        return emp.getEmpId() == this.getEmpId() && emp.getEmpName() == this.getEmpName();
    }

    @Override
    public int hashCode() {
        return this.getEmpId();
    }
}