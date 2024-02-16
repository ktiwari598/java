package solidprinciples.interfacesegregation.withoutIS;

/**
 * This class does not need 3 methods below still this have to implement them, so this violates Interface Segregation Principle
 * Instead we should make separate interfaces so that unused methods are as minimum as possible
 */
public class GooglePay implements UPI {
    @Override
    public void makePayment() {
        System.out.println("Payment Done");
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance is : ");
    }

    @Override
    public void addToWallet() {
        //doNothing
    }

    @Override
    public void addMutualFunds() {
        //doNothing
    }

    @Override
    public void addStocks() {
        //doNothing
    }
}
