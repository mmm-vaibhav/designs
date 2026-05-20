package system_design.decorator_pattern.exm1.decorators;

import system_design.decorator_pattern.exm1.bases.BasePizza;
import system_design.decorator_pattern.exm1.bases.Margarita;

public class Mushroom extends ToppingDecorator{

    private final BasePizza basePizza;

    public Mushroom(Margarita basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getPrice() {
        return this.basePizza.getPrice() + 15;
    }
}
