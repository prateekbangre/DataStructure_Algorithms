package com.prateekbangre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author prateek.bangre on 11/08/20.
 * @Project LeetCode
 */
/*
https://leetcode.com/problems/3sum/
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.
Note:
The solution set must not contain duplicate triplets.

Example:
Given array nums = [-1, 0, 1, 2, -1, -4],
A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/
public class Three_Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> result = new HashSet<>();



        return new ArrayList<>(result);
    }

    public static void main(String[] args) {

        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> listResults = threeSum(nums);
        listResults.forEach(result -> {
            System.out.println();
            result.forEach(System.out::print);
        });
    }
}
