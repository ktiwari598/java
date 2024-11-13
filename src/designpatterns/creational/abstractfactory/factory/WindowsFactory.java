package designpatterns.creational.abstractfactory.factory;

import designpatterns.creational.abstractfactory.products.Button;
import designpatterns.creational.abstractfactory.products.TextBox;
import designpatterns.creational.abstractfactory.products.WindowsButton;
import designpatterns.creational.abstractfactory.products.WindowsTextBox;

public class WindowsFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
