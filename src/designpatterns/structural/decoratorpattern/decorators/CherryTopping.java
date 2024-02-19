package designpatterns.structural.decoratorpattern.decorators;

import designpatterns.structural.decoratorpattern.pizza.BasePizza;

public class CherryTopping extends ToppingDecorators {

    private final BasePizza basePizza;

    public CherryTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 25;
    }
}
