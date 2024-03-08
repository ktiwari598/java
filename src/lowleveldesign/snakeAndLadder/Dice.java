package lowleveldesign.snakeAndLadder;

import java.util.Random;

public class Dice {
    private int diceCount;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int getDiceCount() {
        return diceCount;
    }

    public void setDiceCount(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice() {
        Random random = new Random();
        // Generate a random integer between 0 (inclusive) and 7 (exclusive)
        return random.nextInt(7);
    }
}
