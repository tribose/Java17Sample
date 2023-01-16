package designpatterns.decorator;

public class Garland extends TreeDecorator{

    public Garland(ChristmasTree christmasTree) {
        super(christmasTree);
        System.out.println("Inside Garland constructor");
    }

    public String decorate() {
        System.out.println("Inside Garland decorate() method");
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        System.out.println("Inside decorateWithGarland() method");
        return " decorated with garland";
    }
}
