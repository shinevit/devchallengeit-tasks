package org.devchallenge.acceptance.hackerrank

/**
  * Test 2
  * Puzzle task.
  * Given a number.
  * You must calculate the sum of the number of holes for all of its digits.
  *
  * Rules.
  * The number of holes that each of the digits from 0 to 9 have are equal to
  * the number of closed paths in the digit. Their values are:
  * 1, 2, 5, 7 -> 0 holes
  * 0, 4, 6, 9 -> 1 hole
  * 8 -> 2 holes
  *
  * Containst must be:
  * 1 <= num <= 10^9
  *
  *
  * @author Created by Vitalij Radchenko on 01.05.18.
  */
object Puzzle extends App {

  /**
    * Get count of holes for the input number
    * @param num
    * @return
    */
  def countHoles(num: Int): Int = {
    val holesPerNumber = Array(1, 0, 0, 0, 1, 0, 1, 0, 2, 1); // 0-9

    String.valueOf(num).toCharArray
          .map(char=>holesPerNumber(char-'0'))
          .reduceLeft(_ + _)
  }


  var res = countHoles(630)
  println(res)

  res = countHoles(1288)
  println(res)

  res = countHoles(0)
  println(res)

  res = countHoles(9)
  println(res)

  res = countHoles(1000000000)
  println(res)

  res = countHoles(8888888)
  println(res)

}