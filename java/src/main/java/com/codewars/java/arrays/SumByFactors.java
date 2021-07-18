package com.codewars.java.arrays;

import java.math.BigInteger;
import java.util.*;

/*
Given an array of positive or negative integers

I= [i1,..,in]

you have to produce a sorted array 'P' of the form

[ [p, sum of all ij of I for which p is a prime factor (p positive) of ij] ...]

The sorted array 'P 'will be sorted by increasing order of the prime numbers.
The final result has to be given as a string in Java.

Example:
I = {12, 15}; // result = "(2 12)(3 27)(5 15)"
[2, 3, 5] is the list of all prime factors of the elements of I, hence the result.

Notes:

It can happen that a sum is 0 if some numbers are negative!
Example: I = [15, 30, -45] 5 divides 15, 30 and (-45) so 5 appears in the result, the sum of the numbers for which 5 is
        a factor is 0 so we have [5, 0] in the result amongst others.

*/
public class SumByFactors {
    public String sumOfDivided(int[] inputArray) {

        Map<Integer, Integer> factorSumMap = new TreeMap<>();
        Integer[] allFactorsForInt;

        for (int intRecord : inputArray) {

            allFactorsForInt = getAllFactors(intRecord);

            Arrays.stream(allFactorsForInt).forEach(factorRecord -> {

                if (BigInteger.valueOf(factorRecord).isProbablePrime(100)) {

                    if (factorSumMap.get(factorRecord) == null) {
                        factorSumMap.put(factorRecord, 0);
                    }

                    factorSumMap.put(factorRecord, (factorSumMap.get(factorRecord) + intRecord));
                }
            });
        }
        return formatForOutput(factorSumMap);
    }

    private String formatForOutput(Map<Integer, Integer> factorSumMap) {

        String outputText = "";

        for (Map.Entry<Integer, Integer> factorSumEntry : factorSumMap.entrySet()) {
            outputText += (String.format("(%d %d)", factorSumEntry.getKey(), factorSumEntry.getValue()));
        }

        return outputText;
    }

    private Integer[] getAllFactors(int myInt) {

        Set<Integer> allFactors = new HashSet<>();

        for (int i = 1; i <= Math.abs(myInt); i++) {
            if (myInt % i == 0) allFactors.add(i);
        }

        return allFactors.stream().toArray(Integer[]::new);
    }
}
