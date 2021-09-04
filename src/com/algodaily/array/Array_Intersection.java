package com.algodaily.array;

import java.util.*;

/**
 * @author prateek.bangre on 16/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/array-intersection/java
public class Array_Intersection {

    public static Integer[] arrayIntersection(int[] arr1, int[] arr2) {
        // fill in
        // with solution
        Set<Integer> result = new HashSet<>();
        Set<Integer> temp = new HashSet<>();

        for (int value:arr1) {
            temp.add(value);
        }

        for (int value:arr2) {
            if (temp.contains(value)){
                result.add(value);
            }
        }
        return result.toArray(new Integer[result.size()]);
    }

    // remove or comment if running tests (we run our own main)
    public static void main(String[] args) {

        Array_Intersection method_call = new Array_Intersection();
        int[] arr1 = new int[]{1,2,2,1};
        int[] arr2 = new int[]{2,2};

        System.out.println(Arrays.toString(method_call.arrayIntersection(arr1, arr2)));
    }
}
