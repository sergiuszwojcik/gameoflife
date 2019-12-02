package com.solidbrain.interviews.gameoflife;

public class SingleCell {

    public static final char DEATH_CELL = '.';
    public static final char ALIVE_CELL = 'o';

    private String[] board;

    public boolean isCellPopulated(int x, int y) {
        return board[x].charAt(y) == ALIVE_CELL;
    }

    public boolean cellExistenceRules(int aliveCells, boolean isCellAlive) {
        if (isCellAlive && (aliveCells < 2 || aliveCells > 3)) {
            return false;
        } else if (isCellAlive && (aliveCells == 3 || aliveCells == 2)) {
            return true;
        } else if (!isCellAlive && aliveCells == 3) {
            return true;
        } else {
            return false;
        }
    }

    public char getCellState(int aliveCells, boolean isCellAlive) {
        if (cellExistenceRules(aliveCells, isCellAlive)) {
            return ALIVE_CELL;
        } else {
            return DEATH_CELL;
        }
    }

    public void setBoard(String[] board) {
        this.board = board;
    }

    public String[] getBoard() {
        return board;
    }
}
