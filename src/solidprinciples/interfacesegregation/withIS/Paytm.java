package solidprinciples.interfacesegregation.withIS;

import solidprinciples.interfacesegregation.withIS.interfaces.Payment;
import solidprinciples.interfacesegregation.withIS.interfaces.Stocks;
import solidprinciples.interfacesegregation.withIS.interfaces.Wallet;

public class Paytm implements Payment, Wallet, Stocks {
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

    @Override
    public void addWallet() {

    }
}
