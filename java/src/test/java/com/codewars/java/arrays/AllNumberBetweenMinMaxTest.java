package com.codewars.java.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllNumberBetweenMinMaxTest {

    @Test
    public void testHealthCheck() {
        Assert.assertTrue(true);
        AllNumberBetweenMinMax actualObject = new AllNumberBetweenMinMax();
        Assert.assertNotNull(actualObject);
    }

    @Test
    public void providedTest() {

        AllNumberBetweenMinMax levelPipeFixer = new AllNumberBetweenMinMax();

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, levelPipeFixer.pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, levelPipeFixer.pipeFix(new int[]{1, 2, 3, 12}));
        assertArrayEquals(new int[]{6, 7, 8, 9}, levelPipeFixer.pipeFix(new int[]{6, 9}));
        assertArrayEquals(new int[]{-1, 0, 1, 2, 3, 4}, levelPipeFixer.pipeFix(new int[]{-1, 4}));
        assertArrayEquals(new int[]{1, 2, 3}, levelPipeFixer.pipeFix(new int[]{1, 2, 3}));
    }

    @DisplayName("Given pipeFix")
    @Nested
    class GivenPipeFix {

        @DisplayName("When number array with one item only present")
        @Nested
        class WhenNumberArrayWithOneItemOnlyPresent {

            @DisplayName("Then return the expected array")
            @Test
            public void thenReturnTheExpectedArray() {
                AllNumberBetweenMinMax levelPipeFixer = new AllNumberBetweenMinMax();

                int[] expectedArray = {7};
                int[] singleItemArray = {7};
                assertArrayEquals(expectedArray, levelPipeFixer.pipeFix(singleItemArray));
            }
        }

        @DisplayName("When number array with more than one item is preset")
        @Nested
        class WhenNumberArrayWithMoreThanOneItemIsPreset {

            @DisplayName("When the numbers are ordered least to greatest")
            @Nested
            class WhenTheNumbersAreOrderedLeastToGreatest {

                @DisplayName("Then return the expected array")
                @Test
                public void thenReturnTheExpectedArray() {

                    AllNumberBetweenMinMax levelPipeFixer = new AllNumberBetweenMinMax();

                    int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                    int[] leastToGreatestArray = {1, 2, 7, 8, 9};
                    assertArrayEquals(expectedArray, levelPipeFixer.pipeFix(leastToGreatestArray));
                }
            }

            @DisplayName("When the numbers are ordered greatest to least")
            @Nested
            class WhenTheNumbersAreOrderedGreatestToLeast {
                @DisplayName("Then return the expected array")
                @Test
                public void thenReturnTheExpectedArray() {

                    AllNumberBetweenMinMax levelPipeFixer = new AllNumberBetweenMinMax();

                    int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                    int[] greatestToLeastArray = {9, 8, 7, 3, 1};
                    assertArrayEquals(expectedArray, levelPipeFixer.pipeFix(greatestToLeastArray));
                }
            }

            @DisplayName("When the numbers are not ordered naturally")
            @Nested
            class WhenTheNumbersAreNotOrderedNaturally {

                @DisplayName("Then return the expected array")
                @Test
                public void thenReturnTheExpectedArray() {

                    AllNumberBetweenMinMax levelPipeFixer = new AllNumberBetweenMinMax();

                    int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                    int[] unorderedArray = {9, 2, 5, 4, 1, 9};
                    assertArrayEquals(expectedArray, levelPipeFixer.pipeFix(unorderedArray));
                }
            }
        }
    }
}