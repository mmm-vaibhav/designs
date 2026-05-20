package system_design.decorator_pattern.exm1.decorators;

import system_design.decorator_pattern.exm1.bases.BasePizza;
import system_design.decorator_pattern.exm1.bases.VegLoaded;

public class ExtraCheeseDecorator extends ToppingDecorator{

    private BasePizza basePizza;


    public ExtraCheeseDecorator(VegLoaded basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getPrice() {
        return this.basePizza.getPrice() + 20;
    }
}
