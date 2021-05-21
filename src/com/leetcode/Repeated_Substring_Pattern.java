package com.prateekbangre;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author prateek.bangre on 23/08/20.
 * @Project LeetCode
 */
/*
URL: https://leetcode.com/problems/repeated-substring-pattern/
Given a non-empty string check if it can be constructed by taking a substring of it and
appending multiple copies of the substring together. You may assume the given string consists of
lowercase English letters only and its length will not exceed 10000.

Example 1:
Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.

Example 2:
Input: "aba"
Output: False

Example 3:
Input: "abcabcabcabc"
Output: True
Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
* */
public class Repeated_Substring_Pattern {

    // using KMP algorithm
//    public static boolean repeatedSubstringPattern(String s) {
//        int length = s.length();
//        int[] lps = new int[length];
//        int i = 0, j = 1;
//
//        while (j<length){
//            if (s.charAt(i) == s.charAt(j)){
//                lps[j] = i+1;
//                i++;
//                j++;
//            }else {
//                if (i == 0){
//                    lps[j] = 0;
//                    ++j;
//                }else {
//                    i = lps[i-1];
//                }
//            }
//        }
//
//        if (lps[length-1] == 0){
//            return false;
//        }
//
//        int subStringLength = length - lps[length-1];
//        return length%subStringLength == 0;
//    }

    public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for(int i = length/2; i >= 1; i--) {
            if(length%i == 0) {
                int m = length/i;
                String subString = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<m;j++) {
                    sb.append(subString);
                }
                if(sb.toString().equals(s))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcabcabc";
//        String s = "aabaaba";
        System.out.println(repeatedSubstringPattern(s));
    }
}
