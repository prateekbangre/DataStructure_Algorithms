package com.prateekbangre;

import java.util.Arrays;

/**
 * @author prateek.bangre on 13/08/20.
 * @Project LeetCode
 */
/*
URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
* */
public class Remove_Duplicates_From_Sorted_Array {

//    Approach Two Pointers
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0){
            return 0;
        }
        int point1 = 0;
        for (int point2 = 0; point2<nums.length ; point2++) {

            if (nums[point1] != nums[point2]){
                point1++;
                nums[point1] = nums[point2];
            }
        }

        return point1+1;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{1,1,2};
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));

        System.out.println(Arrays.toString(nums));
    }
}
