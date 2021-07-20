package com.codewars.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/*

Issue
Looks like some hoodlum plumber and his brother has been running around and damaging your stages again.

The pipes connecting your level's stages together need to be fixed before you receive any more complaints. Each pipe should be connecting, since the levels ascend, you can assume every number in the sequence after the first index will be greater than the previous and that there will be no duplicates.

Task
Given the a list of numbers, return the list so that the values increment by 1 for each index up to the maximum value.

Example
Input: 1,3,5,6,7,8

Output: 1,2,3,4,5,6,7,8

 */
public class AllNumberBetweenMinMax {

    public static int[] pipeFix(int[] numbers) {
        return pipeFix1(numbers);
//        return pipeFix2(numbers);
    }

    public static int[] pipeFix1(int[] numbers) {

        Arrays.sort(numbers);

        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();

        List<Integer> levelNumbers = new ArrayList<>();

        for (int index = min; index <= max; index++) {
            levelNumbers.add(index);
        }

        int[] levelNumbersArray = new int[levelNumbers.size()];
        int i = 0;

        for (Integer record : levelNumbers) {
            levelNumbersArray[i] = record.intValue();
            i++;
        }

        System.out.println(levelNumbersArray.toString());
        return levelNumbersArray;
    }

    public static int[] pipeFix2(int[] numbers) {
        Arrays.sort(numbers);
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }
}
