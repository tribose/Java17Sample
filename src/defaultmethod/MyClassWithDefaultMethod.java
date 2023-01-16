package defaultmethod;

public class MyClassWithDefaultMethod implements MyInterface {

    public static void main(String[] args) {
        new MyClassWithDefaultMethod().normalMethod();
    }

    @Override
    public void normalMethod() {
        System.out.println("Inside normalMethod impl()");
        MyInterface.super.myDefaultMethod();
        //MySecondInterface.super.();
    }
}
