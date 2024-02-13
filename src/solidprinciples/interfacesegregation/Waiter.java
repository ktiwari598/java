package solidprinciples.interfacesegregation;

/**
 * This class violates Interface Segregation principle as we are forcing Waiter class to implement methods which are not required
 * Instead, we should create separate interfaces for Waiter, Cook and DishWasher.
 */
public class Waiter implements RestaurantEmployee {
    @Override
    public void washDishes() {
        //not needed
    }

    @Override
    public void cookFood() {
        //not needed
    }

    @Override
    public void serveFood() {
        System.out.println("Served Food");
    }
}
