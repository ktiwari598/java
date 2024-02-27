package lowleveldesign.vendingmachine.vendingmachinestate.impl;

import lowleveldesign.vendingmachine.Coin;
import lowleveldesign.vendingmachine.Item;
import lowleveldesign.vendingmachine.VendingMachine;
import lowleveldesign.vendingmachine.vendingmachinestate.State;

import java.util.List;

public class SelectionState implements State {

    public SelectionState(){
        System.out.println("Currently Vending machine is in SelectionState");
    }

    @Override
    public void clickOnInsertCoinBtn(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");
    }

    @Override
    public void clickOnSelectProductBtn(VendingMachine vendingMachine) {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin Coin) throws Exception {
        throw new Exception("you can not insert Coin in selection state");
    }

    @Override
    public void selectProductCode(VendingMachine vendingMachine, int code) throws Exception {
        Item item = vendingMachine.getInventory().getItem(code);
        int paidAmount = 0;
        for(Coin coin : vendingMachine.getEnteredCoins()){
            paidAmount = paidAmount + coin.value;
        }
        if(paidAmount < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() +
                    " and you paid: " + paidAmount);
            refundFullMoney(vendingMachine);
            throw new Exception("insufficient amount");
        }
        else {
            if(paidAmount > item.getPrice()) {
                getChange(paidAmount - item.getPrice());
            }
            vendingMachine.setState(new DispenseState(vendingMachine, code));
        }

    }

    @Override
    public int getChange(int returnMoney) {
        System.out.println("Returned the change in the Coin Dispense Tray: " + returnMoney);
        return returnMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("product can not be dispensed Selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        vendingMachine.setState(new IdleState(vendingMachine));
        return vendingMachine.getEnteredCoins();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception {
        throw new Exception("Inventory can not be updated in Selection state");
    }
}
