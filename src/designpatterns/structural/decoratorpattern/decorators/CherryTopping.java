package designpatterns.structural.decoratorpattern.decorators;

import designpatterns.structural.decoratorpattern.pizza.BasePizza;

public class CherryTopping extends PizzaDecorator {

    public CherryTopping(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return pizza.cost() + 25;
    }

    @Override
    public String description() {
        return "Added CherryTopping to " + pizza.description();
    }
}
