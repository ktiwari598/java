package designpatterns.structural.decoratorpattern.decorators;

import designpatterns.structural.decoratorpattern.pizza.BasePizza;

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
