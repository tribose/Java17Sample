package defaultmethod;

public interface MySecondInterface {
    default void myDefaultMethod() {
        privateMethod("Execute privateMethod of MySecondInterface");
    }

    private void privateMethod(String msg) {
        System.out.println("inside private Method: "+msg);
    }

    default void mySecondDefaultMethod() {
        System.out.println("mySecondDefaultMethod");
    }
}
