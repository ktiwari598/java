package designpatterns.structural.decoratorpattern.pizza;

public class FarmHouse implements BasePizza {
    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String description() {
        return "FarmHouse";
    }
}
