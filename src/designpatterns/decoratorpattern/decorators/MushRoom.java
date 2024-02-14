package designpatterns.decoratorpattern.decorators;

import designpatterns.decoratorpattern.pizza.BasePizza;

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
