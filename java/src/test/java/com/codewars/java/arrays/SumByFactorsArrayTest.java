package com.codewars.java.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumByFactorsArrayTest {

    @Test
    public void testHealthCheck() {
        Assert.assertTrue(true);
        SumByFactors actualObject = new SumByFactors();
        Assert.assertNotNull(actualObject);
    }

    @Test
    public void providedTest() {
        int[] lst = new int[]{12, 15};
        SumByFactors sumByFactors = new SumByFactors();
        assertEquals("(2 12)(3 27)(5 15)", sumByFactors.sumOfDivided(lst));
    }

    @DisplayName("Given sumOfDivided")
    @Nested
    class GivenSumOfDivided {

        @DisplayName("When single positive number is provided")
        @Nested
        class WhenSinglePositiveNumberIsProvided {

            @DisplayName("Then get all expected prime factors and sums")
            @Test
            public void thenGetAllExpectedPrimeFactorsAndSums() {

                int[] inputArray = new int[]{12};

                SumByFactors sumByFactors = new SumByFactors();
                String actualResult = sumByFactors.sumOfDivided(inputArray);

                String expectedResult = "(2 12)(3 12)";
                Assert.assertEquals(expectedResult, actualResult);
            }
        }

        @DisplayName("When many positive numbers are provided")
        @Nested
        class WhenManyPositiveNumbersAreProvided {

            @DisplayName("Then get all expected prime factors and sums")
            @Test
            public void thenGetAllExpectedPrimeFactorsAndSums() {

                int[] inputArray = new int[]{15, 21, 24, 30, 45};

                SumByFactors sumByFactors = new SumByFactors();
                String actualResult = sumByFactors.sumOfDivided(inputArray);

                String expectedResult = "(2 54)(3 135)(5 90)(7 21)";
                Assert.assertEquals(expectedResult, actualResult);
            }
        }

        @DisplayName("When input contains negative numbers and sums to zero")
        @Nested
        class WhenInputContainsNegativeNumbersAndSumsToZero {

            @DisplayName("Then get all expected prime factors and sums")
            @Test
            public void thenGetAllExpectedPrimeFactorsAndSums() {

                int[] lst = new int[]{15, 30, -45};
                SumByFactors sumByFactors = new SumByFactors();
                String actualResults = sumByFactors.sumOfDivided(lst);
                assertTrue(actualResults.contains("(5 0)"), actualResults);
            }
        }
    }
}