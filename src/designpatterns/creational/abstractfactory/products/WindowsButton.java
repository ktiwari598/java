package designpatterns.creational.abstractfactory.products;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button Rendered");
    }
}
