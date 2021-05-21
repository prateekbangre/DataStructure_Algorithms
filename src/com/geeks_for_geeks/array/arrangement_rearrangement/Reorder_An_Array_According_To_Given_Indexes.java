package com.geeks_for_geeks.array.arrangement_rearrangement;

import java.util.Arrays;

/**
 * @author prateek.bangre on 23/04/20.
 * @Project DataStructure_Algorithms
 */
/*
https://www.geeksforgeeks.org/reorder-a-array-according-to-given-indexes/

Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements in “arr[]” according to given
index array. It is not allowed to given array arr’s length.

Example:
Input:  arr[]   = [10, 11, 12];
        index[] = [1, 0, 2];
Output: arr[]   = [11, 10, 12]
        index[] = [0,  1,  2]

Input:  arr[]   = [50, 40, 70, 60, 90]
        index[] = [3,  0,  4,  1,  2]
Output: arr[]   = [40, 60, 90, 50, 70]
        index[] = [0,  1,  2,  3,   4]
Expected time complexity O(n) and auxiliary space O(1)
*/
public class Reorder_An_Array_According_To_Given_Indexes {

    public static void main(String[] args) {
        int arr[] = new int[]{50, 40, 70, 60, 90};
        int index[] = new int[]{3,  0,  4,  1,  2};

        System.out.println(arrangeArrayAsPerIndex(arr, index));
    }

    private static String arrangeArrayAsPerIndex(int[] arr, int[] index) {

        int[] newArray = new int[arr.length];

        for (int i=0; i<arr.length; ++i){
            newArray[index[i]] = arr[i];
        }

        return Arrays.toString(newArray);
    }
}
