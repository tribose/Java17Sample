package multithreading;

public class EqualsComparison {

    public static void main(String[] args) {
        Thread t = new Thread();
        Object o = new Object();
        String s = new String("Hello");

        System.out.println( t == o);
        System.out.println(o == s);
        //System.out.println(t == s);
    }

    public class Employee {
        private String empName;
        private int empId;

        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || obj.getClass() != this.getClass())
                return false;
            Employee emp = (Employee) obj;
            return emp.empId == this.empId && emp.empName == this.empName;
        }
    }
}
