package innerclass;

public class OuterClass {

    private static String msg = "msg";

    public static class InnerClass {
        public void printMessage() {
            System.out.println("Inner class "+ msg);
        }
    }

    public class NonStaticInnerClass {
        public void display() {
            System.out.println("non-static inner class "+ msg);
        }
    }
}

