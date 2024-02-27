package lowleveldesign.vendingmachine;

import lowleveldesign.vendingmachine.vendingmachinestate.State;

import java.util.List;

/**
 * This follows State Design Pattern
 */

public class Client {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try {
            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("clicking on InsertCoinButton");
            System.out.println("|");

            State vendingState = vendingMachine.getState();
            vendingState.clickOnInsertCoinBtn(vendingMachine);

            vendingState = vendingMachine.getState();
            vendingState.insertCoin(vendingMachine, Coin.SILVER);
            vendingState.insertCoin(vendingMachine, Coin.DIAMOND);
            // vendingState.insertCoin(vendingMachine, Coin.NICKEL);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");
            vendingState.clickOnSelectProductBtn(vendingMachine);

            vendingState = vendingMachine.getState();
            vendingState.selectProductCode(vendingMachine, 108);

            displayInventory(vendingMachine);

        } catch (Exception e){
            displayInventory(vendingMachine);
        }
    }

    private static void fillUpInventory(VendingMachine vendingMachine){
        List<ItemShelf> slots = vendingMachine.getInventory().getItems();
        for (int i = 0; i < slots.size(); i++) {
            ItemShelf oldItem = slots.get(i);
            Item newItem = new Item();
            if(i<3) {
                newItem.setItemType(ItemType.COKE);
                newItem.setPrice(12);
            }else if(i<5){
                newItem.setItemType(ItemType.PEPSI);
                newItem.setPrice(9);
            }else if(i<7){
                newItem.setItemType(ItemType.JUICE);
                newItem.setPrice(13);
            }else if(i<10){
                newItem.setItemType(ItemType.SODA);
                newItem.setPrice(7);
            }
            slots.set(i, new ItemShelf(newItem, false, oldItem.getCode()));
        }
    }

    private static void displayInventory(VendingMachine vendingMachine){

        List<ItemShelf> slots = vendingMachine.getInventory().getItems();
        for (ItemShelf slot : slots) {
            System.out.println("CodeNumber: " + slot.getCode() +
                    " Item: " + slot.getItem().getItemType().name() +
                    " Price: " + slot.getItem().getPrice() +
                    " isAvailable: " + !slot.getSoldOut());
        }
    }
}
