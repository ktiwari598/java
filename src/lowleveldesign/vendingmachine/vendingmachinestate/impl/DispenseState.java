package lowleveldesign.vendingmachine.vendingmachinestate.impl;

import lowleveldesign.vendingmachine.Coin;
import lowleveldesign.vendingmachine.Item;
import lowleveldesign.vendingmachine.VendingMachine;
import lowleveldesign.vendingmachine.vendingmachinestate.State;

import java.util.List;

public class DispenseState implements State {

    DispenseState(VendingMachine machine, int codeNumber) throws Exception{
        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public void clickOnInsertCoinBtn(VendingMachine vendingMachine) throws Exception {
        throw new Exception("insert coin button can not clicked on Dispense state");
    }

    @Override
    public void clickOnSelectProductBtn(VendingMachine vendingMachine) throws Exception {
        throw new Exception("product selection buttion can not be clicked in Dispense state");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin Coin) throws Exception {
        throw new Exception("coin can not be inserted in Dispense state");
    }

    @Override
    public void selectProductCode(VendingMachine vendingMachine, int code) throws Exception {
        throw new Exception("product can not be choosen in Dispense state");
    }

    @Override
    public int getChange(int returnMoney) throws Exception {
        throw new Exception("change can not returned in Dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = vendingMachine.getInventory().getItem(code);
        vendingMachine.getInventory().updateSoldOutItem(code);
        vendingMachine.setState(new IdleState(vendingMachine));
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("refund can not be happen in Dispense state");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception {
        throw new Exception("inventory can not be updated in Dispense state");
    }
}
