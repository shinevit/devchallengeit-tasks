package org.hackerrank.test

import org.junit._
import org.junit.Assert._

import org.scalatest.mock._
import org.scalatest.junit.AssertionsForJUnit
import org.scalatest.mockito.MockitoSugar

import org.mockito.Mockito._

/**
  * This is junit test of java class OddNumbersTask with org.mockito.Mockito
  * Give us a regular java syntax
  *
  * @author Created by Vitalij Radchenko on 01.05.18.
 */
class OddNumbersTaskUnitWithMockito extends AssertionsForJUnit with MockitoSugar {

    @Test
    def genOddNumbers_mock_between_1_and_2_thenCorrect(): Unit = {

        // arrange
        val expectedArray = Array(1)

        val mockOddNumbers = mock[OddNumbers] // create mock of OddNumbers class

        when(mockOddNumbers.genOddNumbers(1, 2)).thenReturn(expectedArray) // set stubbing

        // action
        val resultArray = mockOddNumbers.genOddNumbers(1, 2)

        // assert & verifies
        assertResult(expectedArray)(resultArray)
        verify(mockOddNumbers).genOddNumbers(1, 2)
    }


    @Test
    def genOddNumbers_mock_between_2_and_5_thenCorrect(): Unit = {

        // arrange
        val expectedArray = Array(3, 5)

        val mockOddNumbers = mock[OddNumbers] // create mock of OddNumbers class

        when(mockOddNumbers.genOddNumbers(2, 5)).thenReturn(expectedArray) // set stubbing

        // action
        val resultArray = mockOddNumbers.genOddNumbers(2, 5)

        // asserts & verifies
        assertResult(expectedArray)(resultArray)
        verify(mockOddNumbers).genOddNumbers(2, 5)
    }



    @Test
    def genOddNumbers_real_between_3_and_5_thenCorrect(): Unit = {

        // arrange
        val expectedArray = Array(3, 5)

        val numbersGenerator = new OddNumbers

        // actions
        val resultArray = numbersGenerator.genOddNumbers(2, 5)

        // asserts
        assertResult(expectedArray)(resultArray)
    }

}