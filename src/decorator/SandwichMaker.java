package decorator;

public class SandwichMaker {
    public static void main(String[] args) {
        Sandwich whiteBreadSandwich = new WhiteBreadSandwich();
        whiteBreadSandwich = new CheeseDecorator(whiteBreadSandwich);
        whiteBreadSandwich = new TomatoDecorator(whiteBreadSandwich);
        System.out.println(whiteBreadSandwich.getPrice());
    }
}
