package lowleveldesign.vendingmachine;

public enum Coin {
    SILVER(5),
    GOLD(10),
    DIAMOND(20),
    PLATINUM(30);

    public int value;

    Coin(int value) {
        this.value = value;
    }
}
