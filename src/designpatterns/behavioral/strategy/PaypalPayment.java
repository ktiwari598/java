package designpatterns.behavioral.strategy;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Paypal.");
    }
}
