package com.leetcode.array;

import java.util.Arrays;

/**
 * @author prateek.bangre on 07/07/21.
 * @Project DataStructure_Algorithms
 */
/* url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class Remove_Duplicates_from_Sorted_Array_Solution {

    //Approach Two Pointers
    private static int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;

        int pointer1 = 0;
        for (int pointer2 = 0; pointer2<nums.length; ++pointer2){
            if (nums[pointer1] != nums[pointer2]){
                ++pointer1;
                nums[pointer1] = nums[pointer2];
            }
        }
        return pointer1+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};      //output: 1,2
//        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};       //output: 0,1,2,3,4

        System.out.println("Input: "+Arrays.toString(nums));
        System.out.println("Output: "+removeDuplicates(nums));
    }

}
