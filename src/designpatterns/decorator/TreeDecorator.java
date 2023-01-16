package designpatterns.decorator;

public abstract class TreeDecorator implements ChristmasTree {

    protected ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree) {
        System.out.println("inside TreeDecorator constructor");
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        System.out.println("Inside TreeDecorator decorate() method");
        return this.christmasTree.decorate();
    }
}
