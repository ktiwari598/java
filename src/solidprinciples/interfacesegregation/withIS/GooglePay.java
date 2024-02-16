package solidprinciples.interfacesegregation.withIS;

import solidprinciples.interfacesegregation.withIS.interfaces.Payment;

public class GooglePay implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment Done");
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance is : ");
    }
}
