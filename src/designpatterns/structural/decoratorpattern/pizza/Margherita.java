package designpatterns.structural.decoratorpattern.pizza;

public class Margherita implements BasePizza {
    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String description() {
        return "Margherita";
    }
}
