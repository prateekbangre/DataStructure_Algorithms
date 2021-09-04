package com.leetcode.strings;

/**
 * @author prateek.bangre on 07/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/
https://leetcode.com/problems/reverse-integer/
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Example 1:
Input: x = 123
Output: 321
 */
public class Reverse_Integer {

    private static int reverse(int x) {

        long result = 0;
        while (x!=0){
            result = result*10 + x%10;
            x = x/10;
        }

        if ( result>=Integer.MIN_VALUE && result<=Integer.MAX_VALUE)
            return (int)result;

        return 0;
    }

    public static void main(String[] args) {
//        int x = 123;        //output: 321
//        int x = -123;        //output: -321
//        int x = 120;        //output: 21
//        int x = 0;        //output: 0
        int x = 1534236469;        //output: 0
        System.out.println(reverse(x));
    }
}
