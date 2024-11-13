package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.factory.GuiFactory;
import designpatterns.creational.abstractfactory.factory.MacFactory;
import designpatterns.creational.abstractfactory.factory.WindowsFactory;
import designpatterns.creational.abstractfactory.products.Button;
import designpatterns.creational.abstractfactory.products.TextBox;

public class Client {
    public static void main(String[] args) {

        GuiFactory factory = null;
        String os = "Windows";

        switch (os) {
            case "Windows" -> factory = new WindowsFactory();
            case "Mac" -> factory = new MacFactory();
        }

        Button button = factory.createButton();
        TextBox textbox = factory.createTextBox();

        button.render();
        textbox.render();
    }
}
