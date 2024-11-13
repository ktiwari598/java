package designpatterns.creational.abstractfactory.products;

public class MacTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Mac TextBox Rendered");
    }
}
