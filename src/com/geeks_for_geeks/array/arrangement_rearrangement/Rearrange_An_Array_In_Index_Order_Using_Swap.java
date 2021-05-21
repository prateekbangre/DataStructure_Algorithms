package com.geeks_for_geeks.array.arrangement_rearrangement;

import java.util.Arrays;

/**
 * @author prateek.bangre on 23/04/20.
 * @Project DataStructure_Algorithms
 */
/*
https://www.geeksforgeeks.org/rearrange-array-arri/

Given an array of elements of length N, ranging from 0 to N – 1. All elements may not be present in the array.
 If element is not present then there will be -1 present in the array. Rearrange the array such that A[i] = i
 and if i is not present, display -1 at that place.

Examples:
Input : arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}
Output : [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]

Input : arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
              11, 10, 9, 5, 13, 16, 2, 14, 17, 4}
Output : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
         11, 12, 13, 14, 15, 16, 17, 18, 19]

Approach Swap elements in Array:
1) Iterate through elements in array
2) If arr[i] >= 0 && arr[i] != i, put arr[i] at i ( swap arr[i] with arr[arr[i]])

*/
public class Rearrange_An_Array_In_Index_Order_Using_Swap {

    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};

        for (int i = 0; i < arr.length;) {
            if (arr[i] >= 0 && arr[i] != i) {
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
