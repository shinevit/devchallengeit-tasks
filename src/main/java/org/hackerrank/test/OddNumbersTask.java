package org.hackerrank.test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * @author Created by Vitalij Radchenko on 01.05.18.
 */
public class OddNumbersTask {

    /**
     * Produce odd numbers from a range
     * @param l left value of range
     * @param r right value of range
     * @return Array odd numbers
     */
    int[] genOddNumbers(int l, int r) {

        List<Integer> intRange = new ArrayList<>();
        for(int n=l; n<=r; n++) {
            if(n%2==1) {
                intRange.add(n);
            }
        }
        int[] arrInt = new int[intRange.size()];
        for(int n=0; n<intRange.size(); n++) {
            arrInt[n] = intRange.get(n);
        }
        return arrInt;
    }



    public static void main(String[] args) {

        OddNumbersTask numberTask = new OddNumbersTask();
        for(int num : numberTask.genOddNumbers(2, 5)) {
            out.println(num);
        }
    }

}
