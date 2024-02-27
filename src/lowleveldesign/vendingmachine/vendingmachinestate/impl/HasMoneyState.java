package lowleveldesign.vendingmachine.vendingmachinestate.impl;

import lowleveldesign.vendingmachine.Coin;
import lowleveldesign.vendingmachine.Item;
import lowleveldesign.vendingmachine.VendingMachine;
import lowleveldesign.vendingmachine.vendingmachinestate.State;

import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState(){
        System.out.println("Currently Vending machine is in HasMoneyState");
    }

    @Override
    public void clickOnInsertCoinBtn(VendingMachine vendingMachine) {
        return;
    }

    @Override
    public void clickOnSelectProductBtn(VendingMachine vendingMachine) {
        vendingMachine.setState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Accepted the coin");
        vendingMachine.getEnteredCoins().add(coin);
    }

    @Override
    public void selectProductCode(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("you need to click on start product selection button first");
    }

    @Override
    public int getChange(int returnMoney) throws Exception {
        throw new Exception("you can not get change in hasMoney state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("product can not be dispensed in hasMoney state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        vendingMachine.setState(new IdleState(vendingMachine));
        return vendingMachine.getEnteredCoins();

    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception {
        throw new Exception("you can not update inventory in hasMoney state");
    }
}
