package com.codewars.java.numbers;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexesFromPrimeStringTest {

    @Test
    public void testHealthCheck() {
        Assert.assertTrue(true);
        IndexesFromPrimeString actualObject = new IndexesFromPrimeString();
        Assert.assertNotNull(actualObject);
    }

    @Test
    public void providedTest() {

        IndexesFromPrimeString checker = new IndexesFromPrimeString();

        Assert.assertEquals(checker.retrievePrimeSubstring(    2,  2), "57");
        Assert.assertEquals(checker.retrievePrimeSubstring(    20,  9), "414347535");
        Assert.assertEquals(checker.retrievePrimeSubstring(    30,  12), "616771737983");
        Assert.assertEquals(checker.retrievePrimeSubstring(    40,  8), "83899710");
        Assert.assertEquals(checker.retrievePrimeSubstring(    50,  6), "031071");
        Assert.assertEquals(checker.retrievePrimeSubstring(    10000,  5), "02192");
        Assert.assertEquals(checker.retrievePrimeSubstring(    20000,  5), "09334");
    }

    @DisplayName("Given retrievePrimeSubstring")
    @Nested
    class GivenRetrievePrimeSubstring {

        @DisplayName("When the beginning index is over ten thousand")
        @Nested
        class WhenTheBeginningIndexIsOverTenThousand {

            @DisplayName("Then return the expected value without exception")
            @Test
            public void thenReturnTheExpectedValueWithoutException() {

                IndexesFromPrimeString checker = new IndexesFromPrimeString();

                assertDoesNotThrow(()-> checker.retrievePrimeSubstring(10000, 5));

                String actualResult = checker.retrievePrimeSubstring(10000, 5);
                String expectedResult = "02192";

                Assert.assertEquals(actualResult, expectedResult);
            }
        }

        @DisplayName("When the beginning index is over twenty thousand")
        @Nested
        class WhenTheBeginningIndexIsOverTwentyThousand {

            @DisplayName("Then return the expected value without exception")
            @Test
            public void thenReturnTheExpectedValueWithoutException() {

                IndexesFromPrimeString checker = new IndexesFromPrimeString();

                assertDoesNotThrow(()-> checker.retrievePrimeSubstring(20000, 5));

                String actualResult = checker.retrievePrimeSubstring(20000, 5);
                String expectedResult = "09334";

                Assert.assertEquals(actualResult, expectedResult);
            }
        }
    }
}