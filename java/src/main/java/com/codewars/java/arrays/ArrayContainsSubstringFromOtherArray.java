package com.codewars.java.arrays;

import java.util.*;

/*
Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.

Example 1:
a1 = ["arp", "live", "strong"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns ["arp", "live", "strong"]

Example 2:
a1 = ["tarp", "mice", "bull"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns []

Notes:
Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.
In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.
Beware: r must be without duplicates.
 */
public class ArrayContainsSubstringFromOtherArray {

    public String[] getStringsThatAreSubstrings(String[] expectedSubstrings, String[] stringsComparedAgainst) {

        TreeSet<String> matchingSubstrings = new TreeSet<>();

        for (String expectedSubstring : expectedSubstrings) {
            for (String comparedToString : stringsComparedAgainst) {
                if (comparedToString.contains(expectedSubstring)) {
                    matchingSubstrings.add(expectedSubstring);
                }
            }
        }

        return matchingSubstrings.toArray(new String[matchingSubstrings.size()]);
    }

    public String[] getStringsThatAreSubstrings2(String[] expectedSubstringsArray, String[] stringsComparedAgainstArray) {

        TreeSet<String> matchingSubstrings = new TreeSet<>();

        Arrays.stream(expectedSubstringsArray).forEach(expectedSubstringRecord -> {
            Arrays.stream(stringsComparedAgainstArray).forEach(comparedToStringRecord -> {
                if (comparedToStringRecord.contains(expectedSubstringRecord)) {
                    matchingSubstrings.add(expectedSubstringRecord);
                }
            });
        });

        return matchingSubstrings.toArray(new String[matchingSubstrings.size()]);
    }

    public String[] getStringsThatAreSubstrings3(String[] expectedSubstrings, String[] stringsComparedAgainst) {

        return Arrays.stream(expectedSubstrings)
                .filter(expectedSubstring -> Arrays.stream(stringsComparedAgainst)
                        .anyMatch(stringComparedAgainst -> stringComparedAgainst.contains(expectedSubstring)))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }
}