package com.prateekbangre;

/**
 * @author prateek.bangre on 16/08/20.
 * @Project LeetCode
 */
/*
URL: https://leetcode.com/problems/minimum-path-sum/
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which
minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.
Example:
Input:
[
  [1,3,1],
  [1,5,1],
  [4,2,1]
]
Output: 7
Explanation: Because the path 1→3→1→1→1 minimizes the sum.
* */
public class Minimum_Path_Sum {

    public static int minPathSum(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i==0 && j==0){
                    dp[i][j] = grid[i][j];
                }else if (i==0){
                    dp[i][j] = grid[i][j] + dp[i][j-1];
                }else if (j==0){
                    dp[i][j] = grid[i][j] + dp[i-1][j];
                }else {
                    dp[i][j] = Math.min(grid[i][j]+dp[i-1][j], grid[i][j]+dp[i][j-1]);
                }
            }
        }
        return dp[n-1][m-1];
    }

    public static void main(String[] args) {

        int[][] grid = new int[][]{
                                    {1,3,1},
                                    {1,5,1},
                                    {4,2,1}
                                };
        System.out.println(minPathSum(grid));
    }
}
