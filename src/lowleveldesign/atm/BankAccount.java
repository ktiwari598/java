package lowleveldesign.atm;

public class BankAccount {
    private int balance;

    public int updateBalance(int amount) {
        return balance - amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
