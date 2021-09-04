package com.company_interview_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * @author prateek.bangre on 26/08/21.
 * @Project DataStructure_Algorithms
 */
/*
Set Differences
Programming challenge description:
Write a program that accepts two sets of alphanumeric characters and compares them. Your code should identify the elements that are in the first set but not the second set and output the results.

Input:
Two lines of input, where each line is a space-delimited series of uppercase alphanumeric values that represents the set. For example:

Z 3 X 2 Y 1

A Z B Y 2 1

Output:
The set of values that are unique in the first set sorted alphanumerically, by digits and then characters. For example:

3 X

If no unique values exist, output NULL

Test 1
Test Input
Download Test 1 Input
Z 3 X 2 Y 1
A Z B Y 2 1
Expected Output
Download Test 1 Input
3 X
Test 2
Test Input
Download Test 2 Input
L M N O P
P O N M 4
Expected Output
Download Test 2 Input
L
Test 3
Test Input
Download Test 3 Input
U T I N O K
K U I T O N
Expected Output
Download Test 3 Input
NULL

*/
public class Nike_Question1_SetDifferences {

    private static String compareFirstWithSecondSet(String first, String second){

        char[] splitFirst = first.replaceAll(" ", "").toCharArray();
        char[] splitSecond = second.replaceAll(" ", "").toCharArray();

        Arrays.sort(splitFirst);
        Arrays.sort(splitSecond);

        HashSet<Character> temp = new HashSet<>();
        HashSet<Character> temp1 = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (Character value: splitFirst) {
            temp.add(value);
        }

        for (Character value: splitSecond) {
            temp1.add(value);
        }

        System.out.println(temp.removeAll(temp1));
        System.out.println(temp1);

        for (Character value: splitSecond) {
            if (!temp.add(value)){
                result.append(value + " ");
            }
        }

        if (result.length() == 0)
            return "NULL";
        else
            return result.toString();


    }

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String first = in.readLine();
        String second = in.readLine();
//        System.out.println(first);
//        System.out.println(second);

        System.out.println(compareFirstWithSecondSet(first, second));

    }


}
