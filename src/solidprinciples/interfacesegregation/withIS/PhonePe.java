package solidprinciples.interfacesegregation.withIS;

import solidprinciples.interfacesegregation.withIS.interfaces.Payment;
import solidprinciples.interfacesegregation.withIS.interfaces.Stocks;

public class PhonePe implements Payment, Stocks {
    @Override
    public void makePayment() {

    }

    @Override
    public void checkBalance() {

    }

    @Override
    public void addMutualFund() {

    }

    @Override
    public void addStock() {

    }
}
