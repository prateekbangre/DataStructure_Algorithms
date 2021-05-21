package com.prateekbangre;

/**
 * @author prateek.bangre on 23/08/20.
 * @Project LeetCode
 */
/*
URL: https://leetcode.com/problems/arranging-coins/
You have a total of n coins that you want to form in a staircase shape, where every k-th row must have
exactly k coins.
Given n, find the total number of full staircase rows that can be formed.
n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:
n = 5
The coins can form the following rows:
¤
¤ ¤
¤ ¤
Because the 3rd row is incomplete, we return 2.

Example 2:
n = 8
The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤
Because the 4th row is incomplete, we return 3.
* */
public class Arranging_Coins {

//    public static int arrangeCoins(int n) {
//
//        int count = n;
//        int line = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i<=count){
////                for (int j = 0; j < i; j++) {
////                    System.out.print("*");
////                }
//                count -= i;
//                line = i;
//            }else {
//                return i-1;
//            }
////            System.out.println();
//        }
//        return line;
//    }

    //other approch
    public static int arrangeCoins(int n) {

        int i = 0;
        while (i++ < n){
            n -= i;
        }
        return i-1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }
}
