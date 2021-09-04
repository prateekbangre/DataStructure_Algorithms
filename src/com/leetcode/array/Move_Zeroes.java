package com.leetcode.array;

import java.util.Arrays;

/**
 * @author prateek.bangre on 07/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
https://leetcode.com/problems/move-zeroes/
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/
public class Move_Zeroes {

    private static void moveZeroes(int[] nums) {

        int index = 0;
        for (int i=0; i< nums.length; ++i){
            if (nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i=index; i< nums.length; ++i){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
