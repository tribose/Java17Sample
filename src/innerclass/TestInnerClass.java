package innerclass;

public class TestInnerClass {
    public static void main(String[] args) {
        OuterClass.InnerClass staticInner = new OuterClass.InnerClass();
        staticInner.printMessage();

        OuterClass outer = new OuterClass();
        OuterClass.NonStaticInnerClass innerClass = outer.new NonStaticInnerClass();
        innerClass.display();

        OuterClass.NonStaticInnerClass innerClass1 = new OuterClass().new NonStaticInnerClass();
        innerClass1.display();
    }
}
