package designpatterns.structural.decoratorpattern;

import designpatterns.structural.decoratorpattern.decorators.CherryTopping;
import designpatterns.structural.decoratorpattern.decorators.ExtraCheese;
import designpatterns.structural.decoratorpattern.decorators.MushRoom;
import designpatterns.structural.decoratorpattern.pizza.Margherita;

/**
 * Decorator pattern is used to prevent class explosion
 * Here, if we don't use Decorator pattern then we need to create multiple classes like MushRoomMargheritaPizza,
 * ExtraCheeseMushRoomCherryToppingVegDelightPizza, CherryToppingExtraCheeseFarmHousePizza, etc
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

        System.out.println(onExtraCheesePizza1.description());
        System.out.println(pranavPizza.cost());
        System.out.println(mushRoom.cost());
        System.out.println(onExtraCheesePizza.cost());
        System.out.println(onExtraCheesePizza1.cost());
    }
}
