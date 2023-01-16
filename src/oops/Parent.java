package oops;

public class Parent {

    public void walk() {
        System.out.println("Parent Walk");
    }

    public void run(){
        System.out.println("Parent run");
        this.walk();
    }
}
