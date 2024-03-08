package lowleveldesign.atm.states;

import lowleveldesign.atm.Atm;
import lowleveldesign.atm.Card;
import lowleveldesign.atm.TransactionType;

public abstract class AtmState {
    public void insertCard(Atm atm, Card card) {
        System.out.println("Nothing here to print!!");
    }

    public void authenticatePin(Atm atm, Card card, int pin) {
        System.out.println("Nothing here to print!!");
    }

    public void selectOperation(Atm atm, Card card, TransactionType type) {
        System.out.println("Nothing here to print!!");
    }

    public void cashWithdrawal(Atm atm, Card card, int withdrawalAmount) {
        System.out.println("Nothing here to print!!");
    }

    public void displayBalance(Atm atm, Card card) {
        System.out.println("Nothing here to print!!");
    }



}
