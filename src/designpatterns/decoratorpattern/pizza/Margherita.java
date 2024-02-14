package designpatterns.decoratorpattern.pizza;

import designpatterns.decoratorpattern.pizza.BasePizza;

public class Margherita extends BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}
