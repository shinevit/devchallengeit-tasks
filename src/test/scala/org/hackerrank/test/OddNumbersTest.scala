package org.hackerrank.test

import org.specs2.mutable.Specification
import org.specs2.mock.Mockito
import org.specs2.mock.Mockito._

/**
  * This is a specs2 test with specs2 Mockito
  *
  * See: https://etorreborre.github.io/specs2/guide/SPECS2-3.4/org.specs2.guide.UseMockito.html
  * @author Created by Vitalij Radchenko on 01.05.18.
  */
class OddNumbersTest extends Specification with Mockito {


  "Create OddNumbers mock" should {

    "call genOddNumbers between 1 and 2" in {

      // arrange
      val expectedArray = Array(1)

      val mockOddNumbers = mock[OddNumbers] // create mock of OddNumbers class
      mockOddNumbers.genOddNumbers(1, 2) returns expectedArray // set stubbing

      // action
      val resultArray = mockOddNumbers.genOddNumbers(1, 2)

      // assert & verifies
      resultArray mustEqual expectedArray
      there was one(mockOddNumbers).genOddNumbers(1, 2)
    }


    "call genOddNumbers between 2 and 5" in {

      // arrange
      val expectedArray = Array(3, 5)

      val mockOddNumbers = mock[OddNumbers] // create mock of OddNumbers class

      mockOddNumbers.genOddNumbers(2, 5) returns expectedArray // set stubbing

      // action
      val resultArray = mockOddNumbers.genOddNumbers(2, 5)

      // asserts & verifies
      resultArray mustEqual expectedArray
      there was one(mockOddNumbers).genOddNumbers(2, 5)
    }

  }


  "OddNumbers real object" should {

    "genOddNumbers between 2 and 5" in {

      // arrange
      val expectedArray = Array(3, 5)

      val numbersGenerator = new OddNumbers

      // actions
      val resultArray = numbersGenerator.genOddNumbers(2, 5)

      // asserts
      resultArray mustEqual expectedArray
    }
  }

}
