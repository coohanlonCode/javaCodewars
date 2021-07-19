package com.codewars.java.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class LargestPairInArrayTest {


    @Test
    public void testHealthCheck() {
        Assert.assertTrue(true);
        LargestPairInArray actualObject = new LargestPairInArray();
        Assert.assertNotNull(actualObject);
    }

    @Test
    public void providedTest() {
        LargestPairInArray pairChecker = new LargestPairInArray();

        Assert.assertEquals(42, pairChecker.largestPairSum1(new int[]{10, 14, 2, 23, 19}));
        Assert.assertEquals(0, pairChecker.largestPairSum1(new int[]{-100, -29, -24, -19, 19}));
        Assert.assertEquals(10, pairChecker.largestPairSum1(new int[]{1, 2, 3, 4, 6, -1, 2}));
        Assert.assertEquals(-18, pairChecker.largestPairSum1(new int[]{-10, -8, -16, -18, -19}));

        Assert.assertEquals(42, pairChecker.largestPairSum2(new int[]{10, 14, 2, 23, 19}));
        Assert.assertEquals(0, pairChecker.largestPairSum2(new int[]{-100, -29, -24, -19, 19}));
        Assert.assertEquals(10, pairChecker.largestPairSum2(new int[]{1, 2, 3, 4, 6, -1, 2}));
        Assert.assertEquals(-18, pairChecker.largestPairSum2(new int[]{-10, -8, -16, -18, -19}));

        Assert.assertEquals(42, pairChecker.largestPairSum3(new int[]{10, 14, 2, 23, 19}));
        Assert.assertEquals(0, pairChecker.largestPairSum3(new int[]{-100, -29, -24, -19, 19}));
        Assert.assertEquals(10, pairChecker.largestPairSum3(new int[]{1, 2, 3, 4, 6, -1, 2}));
        Assert.assertEquals(-18, pairChecker.largestPairSum3(new int[]{-10, -8, -16, -18, -19}));

        Assert.assertEquals(42, pairChecker.largestPairSum4(new int[]{10, 14, 2, 23, 19}));
        Assert.assertEquals(0, pairChecker.largestPairSum4(new int[]{-100, -29, -24, -19, 19}));
        Assert.assertEquals(10, pairChecker.largestPairSum4(new int[]{1, 2, 3, 4, 6, -1, 2}));
        Assert.assertEquals(-18, pairChecker.largestPairSum4(new int[]{-10, -8, -16, -18, -19}));
    }


    @DisplayName("Given largestPairSum")
    @Nested
    class GivenLargestPairSum {

        @DisplayName("When provided with an int array")
        @Nested
        class WhenProvidedWithAnIntArray {

            @DisplayName("Then get the sum of the two largest items")
            @Test
            public void thenGetTheSumOfTheTwoLargestItems() {

                LargestPairInArray pairChecker = new LargestPairInArray();

                int[] input = {10, 2, 15, 1, 9, 8};
                Assert.assertEquals(25, pairChecker.largestPairSum(input));


            }

        }
    }

}