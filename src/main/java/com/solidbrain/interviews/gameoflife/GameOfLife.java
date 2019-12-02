package com.solidbrain.interviews.gameoflife;

import java.util.Arrays;

public class GameOfLife {

    public static Board fromGrid(String[] input) throws IllegalArgumentException {
        return new BoardImpl(input);
    }

}