package com.solidbrain.interviews.gameoflife;

import java.util.Arrays;

public class GameOfLife {

    public static Board fromGrid(String[] input) {
        //Dodaj sprawdzanie danych wejsciowych
        //throw new IllegalArgumentException();
        return new BoardImpl(input);
    }

}