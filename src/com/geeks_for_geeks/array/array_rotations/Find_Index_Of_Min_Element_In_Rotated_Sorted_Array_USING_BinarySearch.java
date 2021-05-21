package com.geeks_for_geeks.array.array_rotations;

/**
 * @author prateek.bangre on 07/03/20.
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

we find the index of minimum element, but using Binary Search. The idea is based on the below facts :
1. The minimum element is the only element whose previous is greater than it. If there is no previous element,
then there is no rotation (first element is minimum). We check this condition for middle element by comparing it
with (mid-1)’th and (mid+1)’th elements.
2. If the minimum element is not at the middle (neither mid nor mid + 1), then minimum element lies in
either left half or right half.
    a. If middle element is smaller than last element, then the minimum element lies in left half
    b. Else minimum element lies in right half.

Time Complexity : O(Log n)
*/
public class Find_Index_Of_Min_Element_In_Rotated_Sorted_Array_USING_BinarySearch {

    private static int countRotations(int[] arr, int start, int end){

        // This condition is needed to handle the case when array is not rotated at all
        if (end < start)
            return 0;

        // If there is only one element left
        if (end == start)
            return start;

        //find mid  (start+end)/2
        int mid = start + (end - start)/2;

        // Check if element (mid+1) is minimum element. Consider the cases like
        // {3, 4, 5, 1, 2}
        if (mid < end && arr[mid] > arr[mid+1]){
            return (mid+1);
        }

        // Check if element (mid) is minimum element. Consider the cases like
        // {4, 5, 1, 2, 3}
        if (mid > start && arr[mid] < arr[mid-1]){
            return mid;
        }

        // Decide whether we need to go to left half or right half
        //{3,4,5,6,7,1,2}
        if (arr[mid] > arr[end]){
            return countRotations(arr, mid+1, end);
        }
        return countRotations(arr, start, mid-1);
    }

    public static void main(String[] args) {
        //int arr[] = {15, 18, 2, 3, 6, 12};
        //int[] arr = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int[] arr = {5,6,7,9,2,3};
        int n = arr.length;

        System.out.println(countRotations(arr, 0, n-1));
    }
}
