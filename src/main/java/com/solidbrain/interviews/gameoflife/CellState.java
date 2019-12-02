package com.solidbrain.interviews.gameoflife;

/**
 * @author Sergiusz Wojcik
 */
public class CellState {

    SingleCell singleCell = new SingleCell();
    private int boardLenght;
    private int boardWidth;

    public CellState(String[] board) {
        this.boardLenght = board.length;
        this.boardWidth = board[0].length();
        this.singleCell.setBoard(board);
    }

    public int countLiveCellNeighbours(int x, int y) {
        int countAliveCells = 0;
        for (int cellX = x - 1; cellX <= x + 1; cellX++) {
            for (int cellY = y - 1; cellY <= y + 1; cellY++) {
                if ((cellX != x || cellY != y) && cellX >= 0 && cellX < boardLenght && cellY >= 0 && cellY < boardWidth) {
                    if (singleCell.isCellPopulated(cellX, cellY)) {
                        countAliveCells++;
                    }
                }
            }
        }
        return countAliveCells;
    }
    public char setNewCellState(int x, int y) {
        return singleCell.getCellState(countLiveCellNeighbours(x, y), singleCell.isCellPopulated(x, y));
    }

}
