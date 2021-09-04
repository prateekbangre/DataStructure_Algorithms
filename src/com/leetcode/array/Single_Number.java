package com.leetcode.array;

import java.util.Arrays;

/**
 * @author prateek.bangre on 07/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
https://leetcode.com/problems/single-number/
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:
Input: nums = [2,2,1]
Output: 1
*/
public class Single_Number {

    //using Bit Manipulation
    private static int singleNumber(int[] nums) {

        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{2,2,1};      //output: 1
        int[] nums = new int[]{4,1,2,1,2};      //output: 4
//        int[] nums = new int[]{1};      //output: 1

        System.out.println(singleNumber(nums));
    }
}
