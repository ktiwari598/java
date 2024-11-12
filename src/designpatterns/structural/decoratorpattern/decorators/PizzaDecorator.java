package designpatterns.structural.decoratorpattern.decorators;

import designpatterns.structural.decoratorpattern.pizza.BasePizza;

public abstract class PizzaDecorator implements BasePizza {

    protected BasePizza pizza;

    public PizzaDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost();
    }

    @Override
    public String description() {
        return this.pizza.description();
    }
}
