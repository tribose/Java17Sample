package designpatterns.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        /*ChristmasTree christmasTree = new BubbleLights(new ChristmasTreeImpl());
        System.out.println(christmasTree.decorate());

        ChristmasTree christmasTree1 = new Garland(new ChristmasTreeImpl());
        System.out.println(christmasTree1.decorate());*/

        ChristmasTree christmasTree2 = new Garland(new Garland(new ChristmasTreeImpl()));
        System.out.println(christmasTree2.decorate());
    }
    /*
    * 1. create impl object
    * 2. create impl object and set impl class to TheeDecorator instance variable
    * 3. create Garland object, which is referring to impl obj
    * 4. create one more garland object which refers to previous garland object
    * 5. christmasTre2 refers to a garland object which intern refers to another garland object
    * 6.
    * */
}
