package com.solidbrain.interviews.gameoflife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Sergiusz Wojcik
 */
class SingleCellTest {

    SingleCell singleCell = new SingleCell();

    private String[] testBoard = {
            "..o...",
            "xxxo..",
            "a...oo",
            "P..oo."
    };


    @Test
    void isCellAliveCheckCorrect() {
        singleCell.setBoard(testBoard);
        assertTrue(singleCell.isCellPopulated(0, 2));
        assertTrue(singleCell.isCellPopulated(3, 3));
    }

    @Test
    void isCellAliveCheckWrong() {
        singleCell.setBoard(testBoard);
        assertFalse(singleCell.isCellPopulated(2, 0));
        assertFalse(singleCell.isCellPopulated(0, 5));
    }


    @Test
    void cellExistenceRulesCheckLive() {
        boolean live = true;
        assertEquals(singleCell.cellExistenceRules(0, live), false);
        assertEquals(singleCell.cellExistenceRules(1, live), false);
        assertEquals(singleCell.cellExistenceRules(2, live), true);
        assertEquals(singleCell.cellExistenceRules(3, live), true);
        assertEquals(singleCell.cellExistenceRules(4, live), false);
        assertEquals(singleCell.cellExistenceRules(5, live), false);
        assertEquals(singleCell.cellExistenceRules(6, live), false);
        assertEquals(singleCell.cellExistenceRules(7, live), false);
        assertEquals(singleCell.cellExistenceRules(8, live), false);
    }

    @Test
    void cellExistenceRulesCheckDead() {
        boolean death = false;
        assertEquals(singleCell.cellExistenceRules(0, death), false);
        assertEquals(singleCell.cellExistenceRules(1, death), false);
        assertEquals(singleCell.cellExistenceRules(2, death), false);
        assertEquals(singleCell.cellExistenceRules(3, death), true);
        assertEquals(singleCell.cellExistenceRules(4, death), false);
        assertEquals(singleCell.cellExistenceRules(5, death), false);
        assertEquals(singleCell.cellExistenceRules(6, death), false);
        assertEquals(singleCell.cellExistenceRules(7, death), false);
        assertEquals(singleCell.cellExistenceRules(8, death), false);
    }

    @Test
    void setBoard() {
        singleCell.setBoard(testBoard);
        assertEquals(singleCell.getBoard(), testBoard);
    }
}