package designpatterns.structural.decoratorpattern.pizza;

public class VegDelight implements BasePizza {
    @Override
    public int cost() {
        return 120;
    }

    @Override
    public String description() {
        return "VegDelight";
    }
}
