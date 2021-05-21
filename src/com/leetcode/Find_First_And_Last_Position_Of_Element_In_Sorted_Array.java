package com.prateekbangre;

import java.util.Arrays;

/**
 * @author prateek.bangre on 13/08/20.
 * @Project LeetCode
 */
/*
URL: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
Given an array of integers nums sorted in ascending order, find the starting and ending position
of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).
If the target is not found in the array, return [-1, -1].

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
* */
public class Find_First_And_Last_Position_Of_Element_In_Sorted_Array {

    public static int[] searchRange(int[] nums, int target) {

        int[] result = new int[]{-1,-1};

        int left = getLeftAndRightPosition(nums, target, true);
        if (left == nums.length || nums[left] != target) {
            return result;
        }

        result[0] = left;
        result[1] = getLeftAndRightPosition(nums, target, false) - 1;

        return result;
    }

    private static int getLeftAndRightPosition(int[] nums, int target, boolean left) {

        int start = 0;
        int end = nums.length;

        // [5,7,7,8,8,10]
        while (start<end){
            int mid = (start+end)/2;

            if (nums[mid] > target || (left && nums[mid] == target)){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));

    }
}
