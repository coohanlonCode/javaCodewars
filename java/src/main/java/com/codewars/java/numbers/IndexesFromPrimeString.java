package com.codewars.java.numbers;

import java.util.LinkedList;
import java.util.List;

/*
  Consider a sequence made up of the consecutive prime numbers. This infinite sequence would start with:

  "2357111317192329313741434753596167717379..."
  You will be given two numbers: a and b, and your task will be to return b elements starting
  from index a in this sequence.

  For example:
  solve(10,5) == `19232` Because these are 5 elements from index 10 in the sequence.
  Tests go up to about index 20,000.
 */
public class IndexesFromPrimeString {

    public String retrievePrimeSubstring(int indexBeginning, int numbersToReturn) {

        String primeNumbersString = generatePrimeNumbersString(indexBeginning + numbersToReturn );

        String[] primeStringArray = primeNumbersString.split("");

        StringBuilder primeSubstring = new StringBuilder("");
        for (int i = 0; i < numbersToReturn; i++) {
            primeSubstring.append(primeStringArray[indexBeginning + i]);
        }

        return primeSubstring.toString();
    }

    private String generatePrimeNumbersString(int primeNumbersToGenerate) {

        StringBuilder primeStringBuilder = new StringBuilder("");

        generatePrimeNumbersList(primeNumbersToGenerate)
                .forEach(primeNumber -> primeStringBuilder.append(primeNumber.toString()));

        return primeStringBuilder.toString();
    }

    public static List<Integer> generatePrimeNumbersList(int qtyPrimeNumbersToGenerate) {

        List<Integer> primeNumbers = new LinkedList<>();
        primeNumbers.add(2);

        for (int oddNumber = 3, generatedQty = 0; generatedQty <= qtyPrimeNumbersToGenerate; oddNumber += 2) {

            if (isPrimeBruteForce(oddNumber)) {
                primeNumbers.add(oddNumber);
                generatedQty++;
            }
        }

        return primeNumbers;
    }

    private static boolean isPrimeBruteForce(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}