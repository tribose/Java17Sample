package defaultmethod;

public interface MyInterface {

    default void myDefaultMethod() {
        privateMethod("Execute privateMethod");
    }

    private void privateMethod(String msg) {
        System.out.println("inside private Method: "+msg);
    }

    void normalMethod();
}
