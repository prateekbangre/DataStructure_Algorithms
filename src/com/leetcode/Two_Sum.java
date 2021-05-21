package com.prateekbangre;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author prateek.bangre on 08/08/20.
 * @Project LeetCode
 */
/*
//URL: https://leetcode.com/problems/two-sum/
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
* */

public class Two_Sum {

//    public static int[] twoSum(int[] nums, int target) {
//
//        for (int i=0; i<nums.length; ++i){
//            for (int j=i+1; j<nums.length; ++j){
//                if (nums[i]+nums[j] == target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }

    //Approach One-pass Hash Table
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        System.out.println("result: "+ Arrays.toString(twoSum(nums, target)));
    }
}
