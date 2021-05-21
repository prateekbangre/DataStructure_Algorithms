package com.geeks_for_geeks.array.arrangement_rearrangement;

import java.util.Arrays;

/**
 * @author prateek.bangre on 23/04/20.
 * @Project DataStructure_Algorithms
 */
/*
Given an array of integers of size n. Assume ‘0’ as invalid number and all other as valid number.
Convert the array in such a way that if next number is a valid number and same as current number,
double its value and replace the next number with 0. After the modification, rearrange the array such
that all 0’s are shifted to the end.

Examples:
Input : arr[] = {2, 2, 0, 4, 0, 8}
Output : 4 4 8 0 0 0

Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
Output :  4 2 12 8 0 0 0 0 0 0

Approach: First modify the array as mentioned, i.e., if next valid number is same as current number,
double its value and replace the next number with 0.

Time Complexity: O(n)
*/
public class Double_The_First_Element_And_Move_Zero_To_End {

    public static void main(String[] args) {

        int[] arr = { 0, 2, 2, 2, 0, 6, 6, 0, 0, 8 };
        int length = arr.length;

        System.out.println(modifyAndRearrangeArr(arr, length));

    }

    private static String modifyAndRearrangeArr(int[] arr, int length) {

        System.out.println(Arrays.toString(arr));

        for (int i=0; i<length-1; ++i){
            if (arr[i] == arr[i+1]){
                arr[i] = arr[i] * 2;
                arr[i+1] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

        moveAllZeroToEnd(arr, length);

        return Arrays.toString(arr);
    }

    private static void moveAllZeroToEnd(int[] arr, int length) {
        int count = 0;
        int temp;
        for (int i=0; i<length; ++i){

            if (arr[i] != 0){
                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                ++count;
            }
        }
    }
}
