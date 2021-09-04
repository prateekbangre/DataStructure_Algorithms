package com.leetcode.array;

import java.util.Arrays;

/**
 * @author prateek.bangre on 07/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/
https://leetcode.com/problems/plus-one/
Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.
Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
*/
public class Plus_One {

    private static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i= digits.length-1; i>=0; --i){
            digits[i] += carry;
            if (digits[i] <= 9){
                return digits;
            }
            digits[i] = 0;
        }

        int[] ret = new int[digits.length+1];
        ret[0] = 1;
        return ret;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{4,1,2,1,2};

        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
