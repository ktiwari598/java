package designpatterns.structural.decoratorpattern.decorators;

import designpatterns.structural.decoratorpattern.pizza.BasePizza;

public class MushRoom extends PizzaDecorator {

    public MushRoom(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return pizza.cost() + 30;
    }

    @Override
    public String description() {
        return "Added MushRoom to " + pizza.description();
    }
}
