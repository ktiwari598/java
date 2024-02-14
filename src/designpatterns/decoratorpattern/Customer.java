package designpatterns.decoratorpattern;

import designpatterns.decoratorpattern.decorators.CherryTopping;
import designpatterns.decoratorpattern.decorators.ExtraCheese;
import designpatterns.decoratorpattern.decorators.MushRoom;
import designpatterns.decoratorpattern.pizza.Margherita;

/**
 * Decorator pattern is used to prevent class explosion
 *
 */
public class Customer {
    public static void main(String[] args) {
        Margherita margherita = new Margherita();
        ExtraCheese pranavPizza = new ExtraCheese(margherita);
        MushRoom mushRoom = new MushRoom(pranavPizza);
        ExtraCheese onMushRoomPizza = new ExtraCheese(mushRoom);
        ExtraCheese onExtraCheesePizza = new ExtraCheese(onMushRoomPizza);
        CherryTopping onExtraCheesePizza1 = new CherryTopping(onExtraCheesePizza);
        System.out.println(pranavPizza.cost());
        System.out.println(mushRoom.cost());
        System.out.println(onExtraCheesePizza.cost());
        System.out.println(onExtraCheesePizza1.cost());
    }
}
