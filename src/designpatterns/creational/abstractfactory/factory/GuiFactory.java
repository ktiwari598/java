package designpatterns.creational.abstractfactory.factory;

import designpatterns.creational.abstractfactory.products.Button;
import designpatterns.creational.abstractfactory.products.TextBox;

/**
 * Abstract Factory is basically factory of factories
 *
 */

public interface GuiFactory {
    Button createButton();
    TextBox createTextBox();
}
