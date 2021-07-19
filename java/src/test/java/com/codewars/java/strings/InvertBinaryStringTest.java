package com.codewars.java.strings;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryStringTest {

    @Test
    public void testHealthCheck() {
        Assert.assertTrue(true);
        InvertBinaryString actualObject = new InvertBinaryString();
        Assert.assertNotNull(actualObject);
    }

    @Test
    public void providedTest() {

        InvertBinaryString flipper = new InvertBinaryString();
        assertEquals("0", flipper.flipBinaryString("1"));
        assertEquals("01111111010010000001100110111", flipper.flipBinaryString("10000000101101111110011001000"));
        assertEquals("011101", flipper.flipBinaryString("100010"));
    }

    @DisplayName("Given flipBinaryString")
    @Nested
    class GivenFlipBinaryString {

        @DisplayName("When provided with a single character one or zero")
        @Nested
        class WhenProvidedWithASingleCharacterOneOrZero {

            @DisplayName("Then return the expected string")
            @Test
            public void thenReturnTheExpectedString() {

                InvertBinaryString flipper = new InvertBinaryString();
                assertEquals("0", flipper.flipBinaryString("1"));
                assertEquals("1", flipper.flipBinaryString("0"));
            }
        }

        @DisplayName("When provided with a multi character string of ones and zeros")
        @Nested
        class WhenProvidedWithAMultiCharacterStringOfOnesAndZeros {

            @DisplayName("Then return the expected string")
            @Test
            public void thenReturnTheExpectedString() {

                InvertBinaryString flipper = new InvertBinaryString();

                assertEquals("000", flipper.flipBinaryString("111"));
                assertEquals("101", flipper.flipBinaryString("010"));
                assertEquals("11110010", flipper.flipBinaryString("00001101"));
                assertEquals("11111111111111000", flipper.flipBinaryString("00000000000000111"));
                assertEquals("01010110101", flipper.flipBinaryString("10101001010"));


            }
        }
    }

}