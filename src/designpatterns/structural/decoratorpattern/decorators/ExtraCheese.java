package designpatterns.structural.decoratorpattern.decorators;

import designpatterns.structural.decoratorpattern.pizza.BasePizza;

public class ExtraCheese extends PizzaDecorator {

    public ExtraCheese(BasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return pizza.cost() + 15;
    }

    @Override
    public String description() {
        return "Added ExtraCheese to " + pizza.description();
    }
}
