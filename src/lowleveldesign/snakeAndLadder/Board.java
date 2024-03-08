package lowleveldesign.snakeAndLadder;

import OOPS.inheritance.C;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell cells[][];
    private int boardSize;

    public Board(int boardSize, int noOfSnakes, int noOfLadders) {
        this.boardSize = boardSize;
        initializeBoard();
        addSnakesOrLadders(noOfSnakes, noOfLadders);
    }

    public void initializeBoard() {
        cells = new Cell[boardSize][boardSize];
        for(int i=0;i<boardSize;i++) {
            for(int j=0;j<boardSize;j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    private void addSnakesOrLadders(int noOfSnakes, int noOfLadders) {
        while(noOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, boardSize * boardSize - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, boardSize * boardSize - 1);

            if(snakeTail >= snakeHead) {
                //System.out.println("SnakeTail " + snakeTail + " cannot be greater than snakeHead " + snakeHead);
                continue;
            }

            SnakeOrLadder snakeOrLadder = new SnakeOrLadder();
            snakeOrLadder.setStart(snakeHead);
            snakeOrLadder.setEnd(snakeTail);

            Cell cell = getCell(snakeHead);
            cell.setSnakeOrLadder(snakeOrLadder);
            noOfSnakes--;
        }
        while(noOfLadders > 0) {
            int ladderHead = ThreadLocalRandom.current().nextInt(1, boardSize * boardSize - 1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, boardSize * boardSize - 1);

            if(ladderHead >= ladderTail) {
                //System.out.println("LadderHead " + ladderHead + " cannot be greater than ladderTail " + ladderTail);
                continue;
            }

            SnakeOrLadder snakeOrLadder = new SnakeOrLadder();
            snakeOrLadder.setStart(ladderHead);
            snakeOrLadder.setEnd(ladderTail);

            Cell cell = getCell(ladderHead);
            cell.setSnakeOrLadder(snakeOrLadder);
            noOfLadders--;
        }
    }


    public Cell getCell(int head) {
        int row = head/boardSize;
        int col = head%boardSize;
        return cells[row][col];
    }

}
