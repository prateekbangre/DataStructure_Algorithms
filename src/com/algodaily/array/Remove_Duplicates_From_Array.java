package com.algodaily.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author prateek.bangre on 16/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/uniqueness-of-arrays/java
public class Remove_Duplicates_From_Array {

    private List<Integer> uniques(int[] array) {

        List<Integer> result = new ArrayList<>();
        Set<Integer> temp = new HashSet<>();

        for (int value:array) {
            if (temp.add(value))
                result.add(value);
        }
        return result;
    }

    // remove or comment if running tests (we run our own main)
    public static void main(String[] args) {
        Remove_Duplicates_From_Array obj = new Remove_Duplicates_From_Array();
        System.out.println(obj.uniques(new int[] {3, 5, 6, 9, 9, 4, 3, 12}));
        System.out.println(obj.uniques(new int[] {1,3,4,4,5,8,4,2,2}));
    }
}
