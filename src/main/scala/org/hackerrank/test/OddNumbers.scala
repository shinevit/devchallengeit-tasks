package org.hackerrank.test


/**
  * hackerrank.com test task
  * Link for test: https://www.hackerrank.com/tests/sample
  * @author Created by Vitalij Radchenko on 01.05.18.
  */
class OddNumbers {

  /**
    * Produce odd numbers from a range
    * @param l left value of range
    * @param r right value of range
    * @return Array odd numbers
    */
  def genOddNumbers(l: Int, r: Int): Array[Int] = {
      println("real call")
      (l to r).toStream.filter(el => el % 2 == 1).toArray
  }
}


object OddNumbersApp extends App {

  val numbersGenerator = new OddNumbers

  for (num <- numbersGenerator.genOddNumbers(2, 5)) {
    println(num)
  }

}
