package lowleveldesign.vendingmachine;

public class ItemShelf {
    private Item item;
    private boolean soldOut;
    private int code;


    public ItemShelf(Item item, boolean soldOut, int code) {
        this.item = item;
        this.soldOut = soldOut;
        this.code = code;
    }

    public ItemShelf(boolean soldOut, int code) {
        this.soldOut = soldOut;
        this.code = code;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(boolean soldOut) {
        this.soldOut = soldOut;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
