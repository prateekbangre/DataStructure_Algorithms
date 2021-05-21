package com.geeks_for_geeks.array.array_rotations;

/**
 * @author prateek.bangre on 27/02/20.
 * @Project DataStructure_Algorithms
 */
/*
https://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/

How to count all pairs having sum x?
The stepwise algo is:

1. Find the pivot element of the sorted and the rotated array. The pivot element is the largest element in the
 array. The smallest element will be adjacent to it.
2. Use two pointers (say left and right) with the left pointer pointing to the smallest element and the right
 pointer pointing to largest element.
3. Find the sum of the elements pointed by both the pointers.
4. If the sum is equal to x, then increment the count. If the sum is less than x, then to increase sum move
 the left pointer to next position by incrementing it in a rotational manner. If the sum is greater than x, then to decrease sum move the right pointer to next position by decrementing it in rotational manner.
5. Repeat step 3 and 4 until the left pointer is not equal to the right pointer or until the left pointer is not
 equal to right pointer – 1.
6. Print final count.

Time Complexity: O(n)
*/
public class Find_If_There_Is_Pair_With_Given_Sum_In_Given_Sorted_And_RotatedArray {

    // This function returns
    // count of number of pairs
    // with sum equals to x.
    static int pairsInSortedRotated(int arr[], int length, int sum){
        // Find the pivot element.
        // Pivot element is largest
        // element of array.
        int i;
        for (i = 0; i < length - 1; i++) {
            if (arr[i] > arr[i + 1])
                break;
        }
        // l is index of
        // smallest element.
        int l = (i + 1) % length;

        // r is index of
        // largest element.
        int r = i;

        // Variable to store
        // count of number
        // of pairs.
        int count = 0;

        // Find sum of pair
        // formed by arr[l]
        // and arr[r] and
        // update l, r and
        // cnt accordingly.
        while (l != r){
            // If we find a pair with
            // sum x, then increment
            // cnt, move l and r to
            // next element.
            if (arr[l] + arr[r] == sum){
                count++;

                // This condition is required
                // to be checked, otherwise
                // l and r will cross each
                // other and loop will never
                // terminate.
                if(l == (r - 1 + length) % length){
                    return count;
                }

                l = (l + 1) % length;
                r = (r - 1 + length) % length;
            }

            // If current pair sum
            // is less, move to
            // the higher sum side.
            else if (arr[l] + arr[r] < sum)
                l = (l + 1) % length;

                // If current pair sum
                // is greater, move
                // to the lower sum side.
            else
                r = (length + r - 1) % length;
        }

        return count;
    }

    public static void main (String[] args)
    {
        int arr[] = {11, 15, 6, 7, 9, 10};
        int sum = 16;
        int length = arr.length;

        System.out.println(pairsInSortedRotated(arr, length, sum));
    }
}
