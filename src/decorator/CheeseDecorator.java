package decorator;

import java.math.BigDecimal;

public class CheeseDecorator extends SandwichDecorator {

    private Sandwich currentSandwich;

    public CheeseDecorator(Sandwich sandwich) {
        this.currentSandwich = sandwich;
    }

    @Override
    public BigDecimal getPrice() {
        return currentSandwich.getPrice().add(new BigDecimal("2.0"));
    }
}
