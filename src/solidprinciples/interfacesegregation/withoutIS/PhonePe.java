package solidprinciples.interfacesegregation.withoutIS;

public class PhonePe implements UPI {
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
        System.out.println("Added to wallet");
    }

    @Override
    public void addMutualFunds() {
        System.out.println("Added to MF");
    }

    @Override
    public void addStocks() {
        //doNothing
    }
}
