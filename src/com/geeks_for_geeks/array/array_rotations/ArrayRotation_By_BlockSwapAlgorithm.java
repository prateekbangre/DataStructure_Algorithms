package com.geeks_for_geeks.array.array_rotations;

import java.util.Arrays;

/**
 * @author prateek.bangre on 17/02/20.
 * @Project DataStructure_Algorithms
 */
/*
https://www.geeksforgeeks.org/block-swap-algorithm-for-array-rotation/
Block swap algorithm for array rotation
Initialize A = arr[0..d-1] and B = arr[d..n-1]
1) Do following until size of A is equal to size of B

  a)  If A is shorter, divide B into Bl and Br such that Br is of same
       length as A. Swap A and Br to change ABlBr into BrBlA. Now A
       is at its final place, so recur on pieces of B.

   b)  If A is longer, divide A into Al and Ar such that Al is of same
       length as B Swap Al and B to change AlArB into BArAl. Now B
       is at its final place, so recur on pieces of A.

2)  Finally when A and B are of equal size, block swap them.

Time Complexity: O(n)
*/
public class ArrayRotation_By_BlockSwapAlgorithm {

    private static void swapArray(int[] arr, int start, int end, int d) {
        int i, temp;
        for (i=0; i<d; ++i){
            temp = arr[start+i];
            arr[start+i] = arr[end+i];
            arr[end+i] = temp;
        }
    }

    private static void leftRotate(int[] arr,int i, int d, int n) {

        /* Return If number of elements to be rotated
        is zero or equal to array size */
        if(d == 0 || d == n)
            return;

        /*If number of elements to be rotated
        is exactly half of array size */
        if(n - d == d){
            swapArray(arr, i, n - d + i, d);
            return;
        }

        /* If A is shorter*/
        if(d < n - d){
            swapArray(arr, i, n - d + i, d);
            leftRotate(arr, i, d, n - d);
        } else{ /* If B is shorter*/
            swapArray(arr, i, d, n - d);
            leftRotate(arr, n - d + i, 2 * d - n, d); /*This is tricky*/
        }
    }

    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 7,8,9,10,11,12};
        //int d = 3;              //rotate by d value
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;              //rotate by d value
        int n = arr.length;     //size of array

        leftRotate(arr,0, d, n);
        System.out.println(Arrays.toString(arr));
    }
}
