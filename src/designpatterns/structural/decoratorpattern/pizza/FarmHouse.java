package designpatterns.structural.decoratorpattern.pizza;

public class FarmHouse extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}
