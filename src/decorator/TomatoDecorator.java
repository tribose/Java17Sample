package decorator;

import java.math.BigDecimal;

public class TomatoDecorator extends SandwichDecorator {

    private Sandwich currentSandwich;

    public TomatoDecorator(Sandwich sandwich) {
        this.currentSandwich = sandwich;
    }

    @Override
    public BigDecimal getPrice() {
        return currentSandwich.getPrice().add(new BigDecimal("3.0"));
    }
}
