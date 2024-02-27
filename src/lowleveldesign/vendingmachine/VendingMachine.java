package lowleveldesign.vendingmachine;

import lowleveldesign.vendingmachine.vendingmachinestate.State;
import lowleveldesign.vendingmachine.vendingmachinestate.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State state;
    private List<Coin> enteredCoins;
    private Inventory inventory;

    public VendingMachine() {
        this.state = new IdleState();
        this.enteredCoins = new ArrayList<>();
        this.inventory = new Inventory(10);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Coin> getEnteredCoins() {
        return enteredCoins;
    }

    public void setEnteredCoins(List<Coin> enteredCoins) {
        this.enteredCoins = enteredCoins;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
