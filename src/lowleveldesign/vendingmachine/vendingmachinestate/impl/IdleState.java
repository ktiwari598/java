package lowleveldesign.vendingmachine.vendingmachinestate.impl;

import lowleveldesign.vendingmachine.Coin;
import lowleveldesign.vendingmachine.Item;
import lowleveldesign.vendingmachine.VendingMachine;
import lowleveldesign.vendingmachine.vendingmachinestate.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState(){
        System.out.println("Currently Vending machine is in IdleState");
    }

    public IdleState(VendingMachine machine){
        System.out.println("Currently Vending machine is in IdleState");
        machine.setEnteredCoins(new ArrayList<>());
    }


    @Override
    public void clickOnInsertCoinBtn(VendingMachine vendingMachine) {
        System.out.println("Clicked on Insert Coin Button");
        vendingMachine.setState(new HasMoneyState());
    }

    @Override
    public void clickOnSelectProductBtn(VendingMachine vendingMachine) throws Exception {
        throw new Exception("IdleState: ClickOnSelectProductBtn is not allowed");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin Coin) throws Exception {
        throw new Exception("IdleState: InsertCoin is not allowed");
    }

    @Override
    public void selectProductCode(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("IdleState: SelectProductCode is not allowed");
    }

    @Override
    public int getChange(int returnMoney) throws Exception {
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("product can not be dispensed idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not get refunded in idle state");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception {
        vendingMachine.getInventory().addItem(item, code);
    }
}
