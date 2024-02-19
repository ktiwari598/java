package designpatterns.structural.decoratorpattern.decorators;

import designpatterns.structural.decoratorpattern.pizza.BasePizza;

public class MushRoom extends ToppingDecorators {

    private final BasePizza basePizza;

    public MushRoom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
