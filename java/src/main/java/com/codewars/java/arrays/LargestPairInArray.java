package com.codewars.java.arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Given a sequence of numbers, find the largest pair sum in the sequence.

For example

[10, 14, 2, 23, 19] -->  42 (= 23 + 19)
[99, 2, 2, 23, 19]  --> 122 (= 99 + 23)

Input sequence contains minimum two elements and every element is an integer.
*/
public class LargestPairInArray {

    public int largestPairSum(int[] inputArray) {
        return largestPairSum1(inputArray);
    }

    public int largestPairSum1(int[] inputArray) {
        Arrays.sort(inputArray);
        return inputArray[inputArray.length - 1] + inputArray[inputArray.length - 2];
    }

    public int largestPairSum2(int[] inputArray) {

        List<Integer> inputList = new ArrayList<>(inputArray.length);
        Arrays.stream(inputArray).forEach(myInt -> inputList.add(myInt));

        Collections.sort(inputList);

        int lastIndex = inputList.size() - 1;
        int mySum = inputList.get(lastIndex) + inputList.get(lastIndex - 1);


        return mySum;
    }

    public int largestPairSum3(int[] inputArray) {

        List<Integer> intList = Arrays
                .stream(inputArray)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        return intList.get(intList.size() - 1) + intList.get(intList.size() - 2);
    }

    public int largestPairSum4(int[] inputArray) {

        return IntStream.of(inputArray)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .mapToInt(Integer::intValue)
                .sum();
    }
}