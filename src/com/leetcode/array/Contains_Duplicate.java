package com.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author prateek.bangre on 07/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
https://leetcode.com/problems/contains-duplicate/
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
*/
public class Contains_Duplicate {

    // using sort and check
    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=1; i< nums.length; ++i){
            if (nums[i-1] == nums[i])
                return true;
        }
        return false;
    }

    // using Hash Table
    private static boolean containsDuplicate1(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for (int value: nums){
            if (map.contains(value))
                return true;
            map.add(value);
        }
        return false;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3,1};        //output: true
        int[] nums = new int[]{1,2,3,4};        //output: false
//        int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};        //output: true

//        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate1(nums));
    }
}
