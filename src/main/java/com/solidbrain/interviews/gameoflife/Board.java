package com.solidbrain.interviews.gameoflife;

public interface Board {

    Board nextIteration();

    String[] getGrid();
}
