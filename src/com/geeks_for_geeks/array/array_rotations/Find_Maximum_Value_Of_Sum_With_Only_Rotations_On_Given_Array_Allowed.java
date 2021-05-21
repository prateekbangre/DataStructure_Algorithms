package com.geeks_for_geeks.array.array_rotations;

/**
 * @author prateek.bangre on 29/02/20.
 * @Project DataStructure_Algorithms
 */
/*
https://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-rotations-on-given-array-allowed/
https://www.geeksforgeeks.org/maximum-sum-iarri-among-rotations-given-array/

A Simple Solution is to find all rotations one by one, check sum of every rotation and return the maximum sum.
Time complexity of this solution is O(n2).

We can solve this problem in O(n) time using an Efficient Solution.
Let Rj be value of i*arr[i] with j rotations. The idea is to calculate next rotation value from previous
rotation, i.e., calculate Rj from Rj-1. We can calculate initial value of result as R0, then keep calculating
next rotation values.

Q. How to efficiently calculate Rj from Rj-1?
This can be done in O(1) time. Below are details.

Let us calculate initial value of i*arr[i] with no rotation
    R0 = 0*arr[0] + 1*arr[1] +...+ (n-1)*arr[n-1]

After 1 rotation arr[n-1], becomes first element of array,
arr[0] becomes second element, arr[1] becomes third element
and so on.
    R1 = 0*arr[n-1] + 1*arr[0] +...+ (n-1)*arr[n-2]

    R1 - R0 = arr[0] + arr[1] + ... + arr[n-2] - (n-1)*arr[n-1]

After 2 rotations arr[n-2], becomes first element of array,
arr[n-1] becomes second element, arr[0] becomes third element
and so on.
    R2 = 0*arr[n-2] + 1*arr[n-1] +...+ (n-1)*arr[n-3]

    R2 - R1 = arr[0] + arr[1] + ... + arr[n-3] - (n-1)*arr[n-2] + arr[n-1]

If we take a closer look at above values, we can observe
below pattern

    Rj - Rj-1 = arrSum - n * arr[n-j]

Where arrSum is sum of all array elements, i.e.,

    arrSum = &Sum; arr[i]
        0<=i<=n-1

Below is complete algorithm:
1) Compute sum of all array elements. Let this sum be 'arrSum'.
2) Compute R0 by doing i*arr[i] for given array.
   Let this value be currVal.
3) Initialize result: maxVal = currVal // maxVal is result.
// This loop computes Rj from  Rj-1
4) Do following for j = 1 to n-1
......a) currVal = currVal + arrSum-n*arr[n-j];
......b) If (currVal > maxVal)
            maxVal = currVal
5) Return maxVal

Time Complexity : O(n)

Ex:
Input : arr[] = {8, 3, 1, 2}
Output : 29
Explanation : Let us see all rotations
{8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
{3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
{1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
{2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*1 = 17
*/
public class Find_Maximum_Value_Of_Sum_With_Only_Rotations_On_Given_Array_Allowed {

    private static int maxSumOfArray(int[] arr) {
        // Find array sum and i*arr[i] with no rotation
        int arrSum = 0;  // Stores sum of arr[i]
        int currVal = 0;  // Stores sum of i*arr[i]
        for (int i=0; i<arr.length; i++){
            arrSum = arrSum + arr[i];
            currVal = currVal+(i*arr[i]);
        }

        // Initialize result as 0 rotation sum
        int maxVal = currVal;

        // Try all rotations one by one and find
        // the maximum rotation sum.
        for (int j=1; j<arr.length; j++){
            currVal = currVal + arrSum-arr.length*arr[arr.length-j];
            if (currVal > maxVal)
                maxVal = currVal;
        }

        // Return result
        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Max sum is " + maxSumOfArray(arr));
    }

}
