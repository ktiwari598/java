package designpatterns.creational.abstractfactory.factory;

import designpatterns.creational.abstractfactory.products.Button;
import designpatterns.creational.abstractfactory.products.MacButton;
import designpatterns.creational.abstractfactory.products.MacTextBox;
import designpatterns.creational.abstractfactory.products.TextBox;

public class MacFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MacTextBox();
    }
}
