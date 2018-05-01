package org.devchallenge.acceptance.hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 *    0 1 2 3 4 5 6 7 8 9
 *    1 0 0 0 1 0 1 0 2 1
 *
 * @author Created by Vitalij Radchenko on 01.05.18.
 */
@RunWith(JUnit4.class)
public class PuzzleTaskTest extends Mockito {

    @Test
    public void givenNumberWithNoHoles_thenResultZero() {

        int given = 12357;
        int expectedSum = 0;

        int result = Puzzle.countHoles(given);
        assertEquals(expectedSum, result);
    }


    @Test
    public void givenNumberWithDigitsPerOneHole_thenCorrect() {
        int given = 4069;
        int expectedSum = 4;

        int result = Puzzle.countHoles(given);
        assertEquals(expectedSum, result);
    }


    @Test
    public void given8Eights_thenResult16() {
        int given = 88888888;
        int expectedSum = 16;

        int result = Puzzle.countHoles(given);
        assertEquals(expectedSum, result);
    }


    @Test
    public void givenMixedDigits_ContainsDifferentHoles_thenResult4() {
        int given = 1288;
        int expectedSum = 4;

        int result = Puzzle.countHoles(given);
        assertEquals(expectedSum, result);
    }


    @Test
    public void given630_thenResult2() {
        int given = 630;
        int expectedSum = 2;

        int result = Puzzle.countHoles(given);
        assertEquals(expectedSum, result);
    }

}