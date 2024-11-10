package designpatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext1 = new PaymentContext();
        paymentContext1.setPaymentStrategy(new PaypalPayment());
        paymentContext1.makePayment(50);

        PaymentContext paymentContext2 = new PaymentContext();
        paymentContext2.setPaymentStrategy(new PaypalPayment());
        paymentContext2.makePayment(890);

        PaymentContext paymentContext3 = new PaymentContext();
        paymentContext3.setPaymentStrategy(new CryptoPayment());
        paymentContext3.makePayment(50970);
    }
}
