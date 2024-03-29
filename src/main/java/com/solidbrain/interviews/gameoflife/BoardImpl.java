package com.solidbrain.interviews.gameoflife;

public class BoardImpl implements Board {

    private String[] board;
    private int height;
    private int width;

    public BoardImpl(String[] input) {
        if (validateBoard(input)) {
            this.board = input;
        }
        this.height = board.length;
        this.width = board[0].length();
    }

    private boolean validateBoard(String[] board) throws IllegalArgumentException {
        int boardRowLenght = 0;
        if (!board[0].isEmpty()) {
            boardRowLenght = board[0].length();
        }
        for (int i = 0; i < board.length; i++) {
            if (boardRowLenght > 0 && boardRowLenght == board[i].length()) {
                for (int k = 0; k < boardRowLenght; k++) {
                    if (board[i].charAt(k) != '.' && board[i].charAt(k) != 'o') {
                        throw new IllegalArgumentException();
                    }
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        return true;
    }

    @Override
    public Board nextIteration() {
        CellState cell = new CellState(board);
        //SingleCell singleCell = new SingleCell(board);
        String[] nextGenBoard = new String[board.length];
        for (int h = 0; h < height; h++) {
            StringBuilder sb = new StringBuilder();
            for (int w = 0; w < width; w++) {
                sb.append(cell.setNewCellState(h, w));
            }
            nextGenBoard[h] = sb.toString();
            this.setBoard(nextGenBoard);
        }
        return this;
    }

    @Override
    public String[] getGrid() {
        return board;
    }

    public void setBoard(String[] board) {
        this.board = board;
    }
}
