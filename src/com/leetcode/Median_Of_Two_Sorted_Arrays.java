package com.prateekbangre;

import java.util.Arrays;

/**
 * @author prateek.bangre on 08/08/20.
 * @Project LeetCode
 */
//URL: https://leetcode.com/problems/median-of-two-sorted-arrays/
/*
* There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
You may assume nums1 and nums2 cannot be both empty.

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0

Example 2:
nums1 = [1, 2]
nums2 = [3, 4]
The median is (2 + 3)/2 = 2.5
* */
public class Median_Of_Two_Sorted_Arrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int totalLength = nums1.length + nums2.length;
        int[] num = new int[totalLength];
        int count = 0;
        int i=0, j=0;
        while (i<nums1.length && j<nums2.length){

            if (nums1[i]<nums2[j]){
                num[count++]= nums1[i++];
            }else {
                num[count++]= nums2[j++];
            }
        }

        while (i<nums1.length){
            num[count++]= nums1[i++];
        }

        while (j<nums2.length){
            num[count++]= nums2[j++];
        }

        int mid = totalLength/2;
        if (totalLength%2 == 0 ){
            return (double)(num[mid-1]+num[mid])/2;
        }else {
            return num[mid];
        }
    }

    public static void main(String[] args) {
//        int[] nums1 = new int[]{1, 3};
//        int[] nums2 = new int[]{2};
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3,4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
