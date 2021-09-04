package com.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author prateek.bangre on 07/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
*/
public class Intersection_of_Two_Arrays_II {

    private static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int top = 0;
        int bottom = 0;
        List<Integer> result = new ArrayList<>();

        while (true){
            if (top>=nums1.length || bottom>=nums2.length)
                break;

            if (nums1[top] == nums2[bottom]){
                result.add(nums1[top]);
                top++;
                bottom++;
            }else if (nums1[top] > nums2[bottom]){
                bottom++;
            }else if (nums1[top] < nums2[bottom]){
                top++;
            }
        }

        int[] output = new int[result.size()];
        for (int i=0; i<result.size(); ++i){
            output[i] = result.get(i);
        }

        return output;
    }

    public static void main(String[] args) {

        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};

        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }

    //using hashmap
    private static int[] intersect1(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i< nums1.length; ++i){
            map.put(nums1[i], map.getOrDefault(nums1[i],0)+1);
        }

        int k = 0;
        for (int i=0; i< nums2.length; ++i){

            if (map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                nums1[k] = nums2[i];
                k++;
            }
            map.put(nums2[i], map.getOrDefault(nums2[i],0)-1 );
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}
