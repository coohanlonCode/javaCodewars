package com.codewars.java.strings;

public class InvertBinaryString {

    public String flipBinaryString(final String inputText) {
        return flipBinaryString1(inputText);
//        return flipBinaryString2(inputText);
    }

    public String flipBinaryString1(final String inputText) {

        StringBuilder flippedCode = new StringBuilder();

        for (String letter : inputText.split("")) {
            flippedCode.append(letter.equals("0") ? "1" : "0");
        }

        return flippedCode.toString();
    }

    public String flipBinaryString2(final String inputText) {

        return inputText
                .replaceAll("1", "x")
                .replaceAll("0", "1")
                .replaceAll("x", "0");
    }
}
