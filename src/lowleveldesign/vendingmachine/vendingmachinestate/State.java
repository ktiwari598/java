package lowleveldesign.vendingmachine.vendingmachinestate;

import lowleveldesign.vendingmachine.Coin;
import lowleveldesign.vendingmachine.Item;
import lowleveldesign.vendingmachine.VendingMachine;

import java.util.List;

public interface State {
    void clickOnInsertCoinBtn(VendingMachine vendingMachine) throws Exception;
    void clickOnSelectProductBtn(VendingMachine vendingMachine) throws Exception;
    void insertCoin(VendingMachine vendingMachine, Coin Coin) throws Exception;
    void selectProductCode(VendingMachine vendingMachine, int code) throws Exception;
    int getChange(int returnMoney) throws Exception;
    Item dispenseProduct(VendingMachine vendingMachine, int code) throws Exception;
    List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;
    void updateInventory(VendingMachine vendingMachine, Item item, int code) throws Exception;

}
