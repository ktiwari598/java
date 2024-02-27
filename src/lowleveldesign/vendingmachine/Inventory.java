package lowleveldesign.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<ItemShelf> items;

    public Inventory(int itemCount) {
        initializeInventory(itemCount);
    }

    private void initializeInventory(int itemCount) {
        int code = 101;
        items = new ArrayList<>();
        for(int i=0;i<itemCount;i++) {
            ItemShelf itemShelf = new ItemShelf(true, code);
            code = code + 1;
            items.add(itemShelf);
        }
    }

    public void addItem(Item item, int codeNumber) throws Exception {
        for(int i=0;i<items.size();i++) {
            if(items.get(i).getCode() == codeNumber) {
                if(!items.get(i).getSoldOut()) {
                    ItemShelf itemShelf = new ItemShelf(false, codeNumber);
                    itemShelf.setItem(item);
                    items.set(i, itemShelf);
                }
                else {
                    throw new Exception("already item is present, you can not add item here");
                }
            }
        }
    }

    public Item getItem(int codeNumber) throws Exception {
        Item ans = new Item();
        for (ItemShelf item : items) {
            if (item.getCode() == codeNumber) {
                if (!item.getSoldOut()) {
                    ans =  item.getItem();
                } else {
                    throw new Exception("item already sold out!!");
                }
            }
        }
        return ans;
    }

    public void updateSoldOutItem(int code) {
        for (ItemShelf item : items) {
            if(item.getCode() == code) {
                item.setSoldOut(true);
            }
        }
    }

    public List<ItemShelf> getItems() {
        return items;
    }

    public void setItems(List<ItemShelf> items) {
        this.items = items;
    }
}
