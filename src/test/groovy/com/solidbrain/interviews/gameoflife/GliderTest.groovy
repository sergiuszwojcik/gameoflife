package com.solidbrain.interviews.gameoflife

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

/**
 * This suite test the basic requirements for the task.
 * There is no need to modify this file.
 * It's recommended you add your own test suites.
 */
class GliderTest extends Specification {

    @Shared
    def GLIDER_1 = ["...o..",
                    "....o.",
                    "..ooo.",
                    "......"] as String[],

        GLIDER_2 = ["......",
                    "..o.o.",
                    "...oo.",
                    "...o.."] as String[],

        GLIDER_3 = ["......",
                    "....o.",
                    "..o.o.",
                    "...oo."] as String[],

        GLIDER_4 = ["......",
                    "...o..",
                    "....oo",
                    "...oo."] as String[],

        GLIDER_5 = ["......",
                    "....o.",
                    ".....o",
                    "...ooo"] as String[]

    @Unroll
    def "glider tests"() {
        setup:
        def startingBoard = GameOfLife.fromGrid(currentState)

        expect:
        startingBoard.nextIteration().getGrid() == nextState

        where:
        currentState || nextState
        GLIDER_1     || GLIDER_2
        GLIDER_2     || GLIDER_3
        GLIDER_3     || GLIDER_4
        GLIDER_4     || GLIDER_5
    }
}
