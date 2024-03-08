package lowleveldesign.snakeAndLadder;

public class Player {
    private int playerId;
    private int currentPosition;

    public Player(int playerId, int currentPosition) {
        this.playerId = playerId;
        this.currentPosition = currentPosition;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
