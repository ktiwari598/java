package designpatterns.creational.abstractfactory.products;

public class WindowsTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Windows TextBox Rendered");
    }
}
