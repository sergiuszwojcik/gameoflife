package com.solidbrain.interviews.gameoflife;

public class SingleCell {

    public static final char DEATH_CELL = '.';
    public static final char ALIVE_CELL = 'o';

    private String[] board;

    public boolean isCellAlive(int x, int y) {
        return board[x].charAt(y) == ALIVE_CELL;
    }

    public char cellExistenceRules(int aliveCells, boolean isCellAlive) {
        if (isCellAlive && (aliveCells < 2 || aliveCells > 3)) {
            return DEATH_CELL;
        } else if (isCellAlive && (aliveCells == 3 || aliveCells == 2)) {
            return ALIVE_CELL;
        } else if (!isCellAlive && aliveCells == 3) {
            return ALIVE_CELL;
        } else {
            return DEATH_CELL;
        }
    }

    public void setBoard(String[] board) {
        this.board = board;
    }
}
