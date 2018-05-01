package org.devchallenge.acceptance.hackerrank;

import static java.lang.System.out;

/**
 * Test 2
 * Puzzle task.
 * Given a number.
 * You must calculate the sum of the number of holes for all of its digits.
 *
 * Rules.
 * The number of holes that each of the digits from 0 to 9 have are equal to
 * the number of closed paths in the digit. Their values are:
 *      1, 2, 5, 7 -> 0 holes
 *      0, 4, 6, 9 -> 1 hole
 *      8 -> 2 holes
 *
 * Containst must be:
 *    1 <= num <= 10^9
 *
 * @author Created by Vitalij Radchenko on 01.05.18.
 */
public class PuzzleTask {

    /**
     * Get count of holes for the input number
     * @param num
     * @return
     */
    static int countHoles(int num) {

        char[] digitsInChars = String.valueOf(num).toCharArray();
        int[] holesPerNumber = {1, 0, 0, 0, 1, 0, 1, 0, 2, 1}; // 0-9

        int holes = 0;
        for(char s : digitsInChars) {
            int index = s - '0';
            holes += holesPerNumber[index];
        }
        return holes;
    }



    public static void main(String[] args) {

        int res = 0;

        res = countHoles(630);
        out.println(res);

        res = countHoles(1288);
        out.println(res);

        res = countHoles(0);
        out.println(res);

        res = countHoles(9);
        out.println(res);

        res = countHoles(1000000000);
        out.println(res);

        res = countHoles(8888888);
        out.println(res);

        /*
        Expected result:
        2
        4
        1
        1
        9
        14
        */
    }

}
