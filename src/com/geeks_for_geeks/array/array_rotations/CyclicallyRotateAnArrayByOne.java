package com.geeks_for_geeks.array.array_rotations;

import java.util.Arrays;

/**
 * @author prateek.bangre on 17/02/20.
 * @Project DataStructure_Algorithms
 */
/*
https://www.geeksforgeeks.org/c-program-cyclically-rotate-array-one/
Given an array, cyclically rotate the array clockwise by one.
Examples:
    Input:  arr[] = {1, 2, 3, 4, 5}
    Output: arr[] = {5, 1, 2, 3, 4}

Following are steps.
1) Store last element in a variable say x.
2) Shift all elements one position ahead.
3) Replace first element of array with x
*/
public class CyclicallyRotateAnArrayByOne {

    private static void rotate(int[] arr){
        int length = arr.length;
        int x = arr[length-1];
        for (int i = length-1; i > 0; i--) {
            arr[i] = arr[i-1];
            //System.out.println(Arrays.toString(arr));
        }
        arr[0] = x;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
