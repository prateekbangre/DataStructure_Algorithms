package com.prateekbangre;

/**
 * @author prateek.bangre on 08/08/20.
 * @Project LeetCode
 */
//URL: https://leetcode.com/problems/longest-palindromic-substring/
/*
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length
of s is 1000.

Example 1:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Example 2:
Input: "cbbd"
Output: "bb"
* */
public class Longest_Palindromic_Substring {

    public static String longestPalindrome(String s) {

        int length = s.length();
        if (length<1){
            return "";
        }

        boolean[][] dynamicProg = new boolean[length][length];

        int longest = 1;
        for (int i = 0; i < length; i++) {
            dynamicProg[i][i] = true;
        }

        int start = 0;
        for (int i = 0; i < length - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)){
                dynamicProg[i][i+1] = true;
                start = i;
                longest = 2;
            }
        }

        for (int k=3; k<=length; ++k){
            for (int i=0; i<length-k+1; ++i){

                int j = i+k-1;
                if (dynamicProg[i+1][j-1] && s.charAt(i) == s.charAt(j)){
                    dynamicProg[i][j] = true;
                    if (k>longest){
                        longest = k;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start+longest);
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
