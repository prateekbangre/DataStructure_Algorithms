package com.geeks_for_geeks.array.arrangement_rearrangement;

import java.util.Arrays;

/**
 * @author prateek.bangre on 23/04/20.
 * @Project DataStructure_Algorithms
 */
/*
https://www.geeksforgeeks.org/move-zeroes-end-array/

Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to
{1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same.
Expected time complexity is O(n) and extra space is O(1).

Approach:
* Traverse the given array ‘arr’ from left to right.
* While traversing, maintain count of non-zero elements in array. Let the count be ‘count’.
* For every non-zero element arr[i], put the element at ‘arr[count]’ and increment ‘count’.
* After complete traversal, all non-zero elements have already been shifted to front end and ‘count’ is
set as index of first 0.
* Now all we need to do is that run a loop which makes all elements zero from ‘count’ till end of the array.

Time Complexity: O(n) where n is number of elements in input array.

Auxiliary Space: O(1)
*/
public class Move_All_Zeroes_To_End_Of_Array {

    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;

        System.out.println(moveAllZerosToEnd(arr, n));
    }

    private static String moveAllZerosToEnd(int[] arr, int n) {

        System.out.println(Arrays.toString(arr));
        int count = 0;

        for (int i=0; i<n; ++i){
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }

//        System.out.println(Arrays.toString(arr));

        while (count < n)
            arr[count++] = 0;

        return Arrays.toString(arr);
    }
}
