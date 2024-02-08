package lowleveldesign.tictactoe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    private Deque<Player> players;
    private Board board;

    public Game() {
        initialiseGame();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    private void initialiseGame() {
        //create 2 players
        Player player1 = new Player("Karan", PieceType.X);
        Player player2 = new Player("Piyush", PieceType.O);
        players = new LinkedList<>();
        players.addLast(player1);
        players.addLast(player2);

        //create a board with 3*3
        board = new Board(3);
    }

    public void startGame() {
        while(true) {
            Player currentPlayer = players.getFirst();
            players.removeFirst();

            if(!board.availableCells()) {
                System.out.println("No available cells! Match Draw");
                break;
            }

            System.out.println("[" + currentPlayer.getName() + "] Enter your position: ");
            Scanner scanner = new Scanner(System.in);
            String[] input = scanner.nextLine().split(",");
            if(input.length < 2) {
                System.out.println("Please enter a valid position with format x,y");
                players.addFirst(currentPlayer);
                continue;
            }
            int row = Integer.parseInt(input[0]);
            int col = Integer.parseInt(input[1]);
            System.out.println("row : " + row + " col :" + col);

            boolean addToCell = board.addToCell(row, col, currentPlayer.getPieceType());
            if(!addToCell) {
                System.out.println("Entered cell is not empty!!, please choose another cell");
                players.addFirst(currentPlayer);
                continue;
            }

            board.printBoard();

            if(checkForWinner(row, col)) {
                System.out.println("Winner is " + currentPlayer.getName());
                break;
            }
            players.addLast(currentPlayer);
        }
    }

    private boolean checkForWinner(int row, int col) {
        PieceType[][] matrix = board.getBoard();

        boolean rowCheck = true, colCheck = true, leftDiagonalCheck = true, rightDiagonalCheck = true;
        //rowCheck
        for(int i=1;i<matrix.length;i++) {
            if(matrix[row][i] != matrix[row][i-1]){
                rowCheck = false;
                break;
            }
        }
        if(rowCheck) {
            return true;
        }

        //colCheck
        for(int i=1;i<matrix.length;i++) {
            if(matrix[i][col] != matrix[i-1][col]){
                colCheck = false;
                break;
            }
        }
        if(colCheck) {
            return true;
        }

        //leftDiagonalCheck
        for(int i=0;i<matrix.length;i++) {
            if(matrix[i][i] != matrix[row][col]){
                leftDiagonalCheck = false;
                break;
            }
        }
        if(leftDiagonalCheck) {
            return true;
        }

        //rightDiagonalCheck
        for(int i=0;i<matrix.length;i++) {
            if(matrix[i][matrix.length - i - 1] != matrix[row][col]){
                rightDiagonalCheck = false;
                break;
            }
        }
        return rightDiagonalCheck;
    }
}
