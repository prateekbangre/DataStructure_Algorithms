package com.geeks_for_geeks.array.arrangement_rearrangement;

import java.util.Arrays;

/**
 * @author prateek.bangre on 23/04/20.
 * @Project DataStructure_Algorithms
 */
/*
https://www.geeksforgeeks.org/rearrange-array-order-smallest-largest-2nd-smallest-2nd-largest/

Given an array of integers, task is to print the array in the order – smallest number, Largest number,
2nd smallest number, 2nd largest number, 3rd smallest number, 3rd largest number and so on…..

Examples:
Input : arr[] = [5, 8, 1, 4, 2, 9, 3, 7, 6]
Output :arr[] = {1, 9, 2, 8, 3, 7, 4, 6, 5}

Input : arr[] = [1, 2, 3, 4]
Output :arr[] = {1, 4, 2, 3}

Approach:
1. Sort the elements of array.
2. Take two variables say i and j and point them to the first and last index of the array respectively.
3. Now run a loop and store the elements in the array one by one by incrementing i and decrementing j.

Let’s take an array with input 5, 8, 1, 4, 2, 9, 3, 7, 6 and sort them so the array
become 1, 2, 3, 4, 5, 6, 7, 8, 9. Now take two variables say i and j and point them to the first and
last index of the array respectively, run a loop and store value into new array by incrementing i and
decrementing j. We get final result as 1 9 2 8 3 7 4 6 5.

Time Complexity : O(n Log n)
Auxiliary Space : O(n)
*/
public class Rearrange_An_Array_In_Order_Of_Smallest_Largest_Way {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 8, 1, 4, 2, 9, 3, 7, 6};
        System.out.println(rearrangeArray(arr, arr.length));

    }

    private static String rearrangeArray(int[] arr, int length) {

        System.out.println(Arrays.toString(arr));

        int[] newArray = new int[length];
        Arrays.sort(arr);
        int index = 0;
        for (int i=0, j=length-1; i<=length/2 || j>length/2; ++i, --j){

            if (index < length)
                newArray[index++] = arr[i];

            if (index < length)
                newArray[index++] = arr[j];
        }
        return Arrays.toString(newArray);
    }
}
