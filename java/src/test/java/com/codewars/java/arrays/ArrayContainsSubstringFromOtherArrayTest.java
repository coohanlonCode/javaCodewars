package com.codewars.java.arrays;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayContainsSubstringFromOtherArrayTest {

    @Test
    public void testHealthCheck() {
        Assert.assertTrue(true);
        ArrayContainsSubstringFromOtherArray actualObject = new ArrayContainsSubstringFromOtherArray();
        Assert.assertNotNull(actualObject);
    }

    @Test
    public void providedTest() {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        ArrayContainsSubstringFromOtherArray substringAccumulator = new ArrayContainsSubstringFromOtherArray();
        assertArrayEquals(r, substringAccumulator.getStringsThatAreSubstrings(a, b));
    }

    @DisplayName("Given getStringsThatAreSubstrings")
    @Nested
    class GivenGetStringsThatAreSubstrings {

        @DisplayName("When all substrings are present")
        @Nested
        class WhenAllSubstringsArePresent {

            @DisplayName("Then return an array that matches the substring request input array")
            @Test
            public void thenReturnAnArrayThatMatchesTheSubstringRequestInputArray() {

                String[] expectedSubstrings = new String[]{"red","orange", "yellow"};
                String[] stringsComparedAgainst = new String[]{"redDog","orangeCat", "yellowFish"};

                ArrayContainsSubstringFromOtherArray substringAccumulator = new ArrayContainsSubstringFromOtherArray();

                String[] actualArray = substringAccumulator.getStringsThatAreSubstrings(expectedSubstrings, stringsComparedAgainst);
                String[] expectedArray = new String[]{"orange", "red", "yellow"};

                Assert.assertEquals(expectedArray, actualArray);
            }
        }

        @DisplayName("When some substrings are present")
        @Nested
        class WhenSomeSubstringsArePresent {

            @DisplayName("Then return an array with only the substrings that match")
            @Test
            public void thenReturnAnArrayWithOnlyTheSubstringsThatMatch() {

                String[] expectedSubstrings = new String[]{"red","purple", "yellow"};
                String[] stringsComparedAgainst = new String[]{"redDog","orangeCat", "yellowFish"};

                ArrayContainsSubstringFromOtherArray substringAccumulator = new ArrayContainsSubstringFromOtherArray();

                String[] actualArray = substringAccumulator.getStringsThatAreSubstrings(expectedSubstrings, stringsComparedAgainst);
                String[] expectedArray = new String[]{ "red", "yellow"};

                Assert.assertEquals(expectedArray, actualArray);
            }
        }

        @DisplayName("When no substrings are present")
        @Nested
        class WhenNoSubstringsArePresent {

            @DisplayName("Then return an empty array")
            @Test
            public void thenReturnAnEmptyArray() {

                String[] expectedSubstrings = new String[]{"red","orange", "yellow"};
                String[] stringsComparedAgainst = new String[]{"blueDog","IndigoCat", "VioletFish"};

                ArrayContainsSubstringFromOtherArray substringAccumulator = new ArrayContainsSubstringFromOtherArray();

                String[] actualArray = substringAccumulator.getStringsThatAreSubstrings(expectedSubstrings, stringsComparedAgainst);
                String[] expectedEmptyArray = new String[]{};

                Assert.assertEquals(expectedEmptyArray, actualArray);
            }
        }
    }
}