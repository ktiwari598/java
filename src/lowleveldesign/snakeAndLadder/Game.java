package lowleveldesign.snakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Dice dice;
    Deque<Player> playerDeque;
    Player winner;


    public Game() {
        initialiseGame();
    }

    public void initialiseGame() {
        board = new Board(10, 5, 5);
        dice = new Dice(1);
        winner = null;
        playerDeque = new LinkedList<>();
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player(1, 0);
        Player player2 = new Player(2, 0);
        playerDeque.addLast(player1);
        playerDeque.addLast(player2);
    }

    public void startGame() {
        while(winner == null) {
            //get the next player
            Player playerTurn = findPlayerTurn();
            int currentPosition = playerTurn.getCurrentPosition();
            System.out.println("Player turn is " + playerTurn.getPlayerId() + ", currentPosition : " + currentPosition);

            //roll the dice
            int diceNumber = dice.rollDice();

            int newPosition = currentPosition + diceNumber;
            newPosition = jumpCheck(newPosition);
            playerTurn.setCurrentPosition(newPosition);

            if(playerTurn.getCurrentPosition() >= board.cells.length * board.cells.length - 1) {
                winner = playerTurn;
            }
        }
        System.out.println("Winner is " + winner.getPlayerId());
    }

    private int jumpCheck(int newPosition) {
        if(newPosition > board.cells.length * board.cells.length - 1) {
            return newPosition;
        }
        Cell cell = board.getCell(newPosition);
        if(cell.getSnakeOrLadder() != null && cell.getSnakeOrLadder().getStart() == newPosition) {
            String jumpBy = cell.getSnakeOrLadder().getStart() < cell.getSnakeOrLadder().getEnd() ? "Ladder" : "Snake";
            System.out.println("jump done by : " + jumpBy);
            return cell.getSnakeOrLadder().getEnd();
        }
        System.out.println("No snake or ladder, newPosition " + newPosition);
        return newPosition;
    }

    private Player findPlayerTurn() {
        Player player = playerDeque.removeFirst();
        playerDeque.addLast(player);
        return player;
    }

}
