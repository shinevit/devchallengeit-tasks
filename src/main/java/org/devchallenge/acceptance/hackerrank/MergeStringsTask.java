package org.devchallenge.acceptance.hackerrank;

import static java.lang.System.out;

/**
 * Test 1
 * @author Created by Vitalij Radchenko on 01.05.18.
 */
public class MergeStringsTask {


    static String mergeStrings(String a, String b) {

        int lenOne = a.length();
        int lenSecond = b.length();
        int itLen = Math.min(lenOne, lenSecond);

        String reminder = "";
        if(lenOne<=lenSecond) {
            reminder = b.substring(lenOne);
        }
        else {
            reminder = a.substring(lenSecond);
        }

        StringBuilder sb = new StringBuilder();
        for (int n=0; n<itLen; n++) {
            sb.append(a.charAt(n))
              .append(b.charAt(n));
        }
        sb.append(reminder);
        return sb.toString();
    }



    public static void main(String[] args) {

        out.println(mergeStrings("ab", "zsd"));
        out.println(mergeStrings("abc", "def"));
        out.println(mergeStrings("abcd", "de"));
        out.println(mergeStrings("zbxnsjdns", "idowdk"));
        out.println(mergeStrings("", "zbxnsjdns"));
        out.println(mergeStrings("abb", "zsdd"));
        out.println(mergeStrings("", ""));

        /*
        Results:
        azbsd
        adbecf
        adbecd
        zibdxonwsdjkdns
        zbxnsjdns
        azbsbdd
        */
    }

}