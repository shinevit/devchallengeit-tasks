package org.devchallenge.acceptance.hackerrank

import org.specs2.mutable._
import org.specs2.matcher._

import org.specs2.mock.Mockito
import org.specs2.mock.Mockito._

/**
  *   0 1 2 3 4 5 6 7 8 9
  *   1 0 0 0 1 0 1 0 2 1
  *
  * @author Created by Vitalij Radchenko on 01.05.18.
  */
class PuzzleSpec extends Specification with Mockito {

  "Given number" should {

    "with digits no holes" in {
      val given = 12357
      val expectedSum = 0
      val result = Puzzle.countHoles(given)

      expectedSum mustEqual result
    }


    "with digits per one hole" in {
      val given = 4069
      val expectedSum = 4
      val result = Puzzle.countHoles(given)

      expectedSum mustEqual result
    }


    "with digits of 8 eights" in {
      val given = 88888888
      val expectedSum = 16
      val result = Puzzle.countHoles(given)

      expectedSum mustEqual result
    }


    "contains different holes count should equals 4" in {
      val given = 1288
      val expectedSum = 4
      val result = Puzzle.countHoles(given)

      expectedSum mustEqual result
    }


    "630 should be result 2" in {
      val given = 630
      val expectedSum = 2
      val result = Puzzle.countHoles(given)

      expectedSum mustEqual result
    }
  }

}
