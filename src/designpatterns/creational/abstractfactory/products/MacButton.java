package designpatterns.creational.abstractfactory.products;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac Button Rendered");
    }
}
