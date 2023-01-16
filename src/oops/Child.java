package oops;

public class Child extends Parent {

    public static void main(String[] args) {
        Parent p = new Child();
        p.run();;
    }

    @Override
    public void run() {
        System.out.println("Child run");
        super.run();
    }

    @Override
    public void walk() {
        System.out.println("Child walk");
        super.walk();
    }

}
