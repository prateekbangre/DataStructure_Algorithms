package com.leetcode.strings;

/**
 * @author prateek.bangre on 08/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
https://leetcode.com/problems/implement-strstr/
Implement strStr().
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Clarification:
What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2
 */
public class Implement_strStr {

    private static int strStr(String haystack, String needle) {

        if (needle.isEmpty() || haystack.equals(needle)) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String evalString = haystack.substring(i, i + needle.length());
            if (evalString.equals(needle)) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
//        String haystack = "hello", needle = "ll";
//        String haystack = "aaaaa", needle = "bba";
//        String haystack = "", needle = "";
        String haystack = "mississippi", needle = "issipi";
        System.out.println(strStr(haystack, needle));
    }
}
