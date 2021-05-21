package com.geeks_for_geeks.array.array_rotations;

import java.util.Arrays;

/**
 * @author prateek.bangre on 17/02/20.
 * @Project DataStructure_Algorithms
 */
/*
https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
Reversal algorithm for array rotation
Algorithm :
rotate(arr[], d, n)
  reverse(arr[], 1, d);
  reverse(arr[], d + 1, n);
  reverse(arr[], 1, n);

Let AB are the two parts of the input array where A = arr[0..d-1] and B = arr[d..n-1].
The idea of the algorithm is :
    Reverse A to get ArB, where Ar is reverse of A.
    Reverse B to get ArBr, where Br is reverse of B.
    Reverse all to get (ArBr) r = BA.

Example :
Let the array be arr[] = [1, 2, 3, 4, 5, 6, 7], d =2 and n = 7
A = [1, 2] and B = [3, 4, 5, 6, 7]

Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]

Time Complexity : O(n)
*/
public class ArrayRotation_By_ReversalAlgorithm {

    private static void leftRotate(int[] arr, int no_of_rotate, int length){

        if (no_of_rotate == 0)
            return;

        reverseArray(arr, 0, no_of_rotate-1);
        reverseArray(arr, no_of_rotate, length-1);
        reverseArray(arr, 0, length-1);
    }

    private static void reverseArray(int[] arr, int start, int end) {

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ++start;
            end--;
        }
    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//        int d = 3;              //rotate by d value
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;              //rotate by d value
        int n = arr.length;     //size of array

        leftRotate(arr, d, n);
        System.out.println(Arrays.toString(arr));
    }
}
