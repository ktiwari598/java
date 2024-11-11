package designpatterns.behavioral.observerPattern.StockPriceMonitoring;

/**
 * Benefits of the Observer Pattern
 * Loose Coupling: The subject and observers are loosely coupled. The subject doesn’t know the details
 * of the observers, only that they implement a common interface.
 * Easy to Add Observers: New observers can be added or removed without modifying the subject.
 * Scalability: Useful in scenarios where multiple parts of the system need to respond to the same event.
 */

public class Client {
    public static void main(String[] args) {
        Stock appleStock = new Stock();

        Investor investor1 = new Investor("Karan");
        Investor investor2 = new Investor("Piyush");
        Investor investor3 = new Investor("Pranav");


        appleStock.add(investor1);
        appleStock.add(investor2);
        appleStock.add(investor3);

        appleStock.setPrice(150);
    }
}
