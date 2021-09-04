package com.leetcode.strings;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author prateek.bangre on 08/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/
https://leetcode.com/problems/valid-anagram/
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
 */
public class Valid_Anagram {

    private static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;
        int[] alphabet = new int[26];

        for (char ch: s.toCharArray()){
            alphabet[ch-'a'] += 1;
        }
        for (char ch: t.toCharArray()){
            alphabet[ch-'a'] -= 1;
            if (alphabet[ch-'a'] < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String s = "anagram", t = "nagaram";
        String s = "rat", t = "car";
        System.out.println(isAnagram(s, t));
    }
}
