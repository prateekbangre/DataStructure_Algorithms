package com.geeks_for_geeks.array.array_rotations;

/**
 * @author prateek.bangre on 24/02/20.
 * @Project DataStructure_Algorithms
 */
/*
https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/

An element in a sorted array can be found in O(log n) time via binary search. But suppose we rotate an
ascending order sorted array at some pivot unknown to you beforehand. So for instance, 1 2 3 4 5 might
become 3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.

We can search an element in one pass of Binary Search. The idea is to search
1) Find middle point mid = (l + h)/2
2) If key is present at middle point, return mid.
3) Else If arr[l..mid] is sorted
    a) If key to be searched lies in range from arr[l]
       to arr[mid], recur for arr[l..mid].
    b) Else recur for arr[mid+1..h]
4) Else (arr[mid+1..h] must be sorted)
    a) If key to be searched lies in range from arr[mid+1]
       to arr[h], recur for arr[mid+1..h].
    b) Else recur for arr[l..mid]

Time Complexity O(logn)
*/
public class Search_An_Element_In_A_Sorted_And_Rotated_Array {

    private static int searchInArray(int[] arr, int start, int end, int key) {

        if (start > end)
            return -1;

        int mid = (start + end) / 2;
        if (arr[mid] == key)
            return mid;

        /* If arr[l...mid] first subarray is sorted */
        if (arr[start] <= arr[mid])
        {
            /* As this subarray is sorted, we
               can quickly check if key lies in
               half or other half */
            if (key >= arr[start] && key <= arr[mid])
                return searchInArray(arr, start, mid-1, key);

            /*If key not lies in first half subarray,
           Divide other half  into two subarrays,
           such that we can quickly check if key lies
           in other half */
            return searchInArray(arr, mid+1, end, key);
        }

        /* If arr[l..mid] first subarray is not sorted,
           then arr[mid... h] must be sorted subarry*/
        if (key >= arr[mid] && key <= arr[end])
            return searchInArray(arr, mid+1, end, key);

        return searchInArray(arr, start, mid-1, key);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 6, 7, 8, 9, 1, 2, 3};
        int length = arr.length;
        int key = 1;
        int index = searchInArray(arr, 0, length, key);
        if (index != -1)
            System.out.println("Index: " + index);
        else
            System.out.println("Key not found");

    }
}
