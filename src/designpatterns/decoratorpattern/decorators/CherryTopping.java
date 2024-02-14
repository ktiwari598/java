package designpatterns.decoratorpattern.decorators;

import designpatterns.decoratorpattern.pizza.BasePizza;

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
