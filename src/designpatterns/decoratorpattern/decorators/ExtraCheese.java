package designpatterns.decoratorpattern.decorators;

import designpatterns.decoratorpattern.pizza.BasePizza;

public class ExtraCheese extends ToppingDecorators {

    private final BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 15;
    }
}
