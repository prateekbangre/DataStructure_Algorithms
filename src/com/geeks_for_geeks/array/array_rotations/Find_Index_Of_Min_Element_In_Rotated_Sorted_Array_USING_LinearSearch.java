package com.geeks_for_geeks.array.array_rotations;

/**
 * @author prateek.bangre on 03/03/20.
 * @Project DataStructure_Algorithms
 */
/*
https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

Consider an array of distinct numbers sorted in increasing order. The array has been rotated (clockwise) k
 number of times. Given such an array, find the value of k.

Examples:
Input : arr[] = {15, 18, 2, 3, 6, 12}
Output: 2
Explanation : Initial array must be {2, 3,
6, 12, 15, 18}. We get the given array after
rotating the initial array twice.

Input : arr[] = {7, 9, 11, 12, 5}
Output: 4

Input: arr[] = {7, 9, 11, 12, 15};
Output: 0

If we take closer look at examples, we can notice that the number of rotations is equal to index of
minimum element. A simple linear solution is to find minimum element and returns its index.

Time Complexity : O(n)
*/
public class Find_Index_Of_Min_Element_In_Rotated_Sorted_Array_USING_LinearSearch {

    private static int countRotations(int[] arr, int length) {
        int min = arr[0];
        int minIndex = -1;

        for (int i=0; i<length; ++i){
            if (min >= arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main (String[] args)
    {
        int arr[] = {15, 18, 2, 3, 6, 12};
        int n = arr.length;

        System.out.println(countRotations(arr, n));
    }
}
