package org.hackerrank.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;


/**
 * This is a plain java junit test of OddNumbersTask with org.mockito.Mockito with hamcrest
 *
 * @author Created by Vitalij Radchenko on 01.05.18.
 */
@RunWith(JUnit4.class)
public class OddNumbersTaskUnitTest extends Mockito {

    private OddNumbersTask mockOddNumbers;

    @Before
    public void setUp()  {
        // create a mock
        mockOddNumbers = mock(OddNumbersTask.class);
    }


    @Test
    public void genOddNumbers_mock_between_1_and_2_thenCorrect() {

        // arrange
        int[] expectedArray = {1};

        // configure mock
        when(mockOddNumbers.genOddNumbers(anyInt(), anyInt())).thenReturn(expectedArray); // set stubbing

        // action
        int[] resultArray = mockOddNumbers.genOddNumbers(1, 2);

        // assert & verifies
        verify(mockOddNumbers, atLeastOnce()).genOddNumbers(eq(1), eq(2));
        assertArrayEquals(expectedArray, resultArray);
    }



    @Test
    public void genOddNumbers_mock_between_2_and_5_thenCorrect() {

        // arrange
        int[] expectedArray = {3, 5};

        // configure mock
        when(mockOddNumbers.genOddNumbers(eq(2), eq(5))).thenReturn(expectedArray); // set stubbing

        // action
        int[] resultArray  = mockOddNumbers.genOddNumbers(2, 5);

        // assert & verifies
        verify(mockOddNumbers, atLeastOnce()).genOddNumbers(eq(2), eq(5));
        assertThat(expectedArray, equalTo(resultArray));
    }



    @Test
    public void genOddNumbers_real_between_3_and_5_thenCorrect() {

        // arrange
        int[] expectedArray = {3, 5};

        OddNumbers numbersGenerator = new OddNumbers();

        // actions
        int[] resultArray = numbersGenerator.genOddNumbers(2, 5);

        // asserts
        assertArrayEquals(expectedArray, resultArray);
    }
}
