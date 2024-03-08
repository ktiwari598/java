package lowleveldesign.atm;

public class Card {
    private int cardNumber;
    private int cvv;
    private int expiryDate;
    static int PIN_NUMBER = 12345;
    private String holderName;
    private BankAccount bankAccount;

    public boolean isCorrectPIN(int pin) {
        return pin ==PIN_NUMBER;
    }

    public int getBankBalance() {
        return bankAccount.getBalance();
    }

    public void deductBalance(int amount) {
        bankAccount.updateBalance(amount);
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
