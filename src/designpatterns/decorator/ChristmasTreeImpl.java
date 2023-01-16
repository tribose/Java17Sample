package designpatterns.decorator;

public class ChristmasTreeImpl implements ChristmasTree {

    public  ChristmasTreeImpl() {
        System.out.println("Inside ChristmasTreeImpl constructor");
    }
    @Override
    public String decorate() {
        System.out.println("Inside impl decorate() method");
        return "Christmas tree";
    }
}
