package com.prateekbangre;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author prateek.bangre on 24/08/20.
 * @Project LeetCode
 */
/*
URL: https://leetcode.com/problems/minimum-height-trees/
* */
public class Minimum_Height_Trees {

    public static List<Integer> findMinHeightTrees(int n, int[][] edges) {

        List<Integer> result = new ArrayList<>();
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < edges.length; i++) {

            int[] temp = edges[i];
            if (unique.add(temp[0])){

            }

        }
        result.remove(unique);
        return result;
    }

    public static void main(String[] args) {

        int n = 4;
        int[][] edges = new int[][]{{1, 0}, {1, 2}, {1, 3}};

        System.out.println(findMinHeightTrees(n, edges));
    }
}
