package com.algodaily.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author prateek.bangre on 16/08/21.
 * @Project DataStructure_Algorithms
 */
// https://algodaily.com/challenges/subsets-summing-zero/java
public class Subsets_Summing_Zero {

    public static List<List<Integer>> findSumZeroSubsets(int[] arr) {
        // fill in
        // with solution
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (arr.length == 0)
            return result;

        int sum = 0;
        int start = 0;
        int position = 0;
        while (start<arr.length){
            sum += arr[position];
            if (sum==0){
                result.add(new ArrayList<>(Arrays.asList(start, position)));
                position = ++start;

            }else {
                if (position<arr.length-1)
                    position++;
                else {
                    sum = 0;
                    position = ++start;
                }
            }
        }


        return result;
    }

    // remove or comment if running tests (we run our own main)
    public static void main(String[] args) {
        System.out.println(findSumZeroSubsets(new int[] { 1, 2, 0, -3, -2 })); // [[2, 2], [0, 3]]
    }
}
