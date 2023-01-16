package decorator;

import java.math.BigDecimal;

public class WhiteBreadSandwich extends Sandwich {

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("10.0");
    }
}
