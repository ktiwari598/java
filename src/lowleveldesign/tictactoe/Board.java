package lowleveldesign.tictactoe;

import java.util.Objects;

public class Board {
    private int size;
    private PieceType board[][];

    public Board(int size) {
        this.size = size;
        this.board = new PieceType[size][size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public PieceType[][] getBoard() {
        return board;
    }

    public void setBoard(PieceType[][] board) {
        this.board = board;
    }

    public void printBoard() {
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                System.out.printf("%s ", Objects.isNull(board[i][j]) ? "-" : board[i][j].toString());
            }
            System.out.println();
        }
    }

    public boolean availableCells() {
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                if (board[i][j] == null) return true;
            }
        }
        return false;
    }

    public boolean addToCell(int row, int col, PieceType pieceType) {
        if(row >= 0 && row < size && col >=0 && col < size) {
            if(board[row][col] != null) return false;
            board[row][col] = pieceType;
            return true;
        }
        System.out.println("Invalid cell position! Please enter cell between 0 and " + (size-1));
        return false;
    }
}
