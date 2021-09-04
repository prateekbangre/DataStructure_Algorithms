package com.leetcode.strings;

import java.util.HashSet;

/**
 * @author prateek.bangre on 07/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
https://leetcode.com/problems/first-unique-character-in-a-string/
Given a string s, return the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0
 */
public class First_Unique_Character_in_a_String {

    private static int firstUniqChar(String s) {

        // array to store occurance of each character
        // at index (int)char-(int)'a'
        // i.e. from 0-25
        int[] count = new int[26];
        for (char ch: s.toCharArray()) {
            count[ch-'a'] += 1;
        }

        for (int i=0; i<s.length(); ++i) {
            if ( count[s.charAt(i)-'a'] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        String s = "leetcode";      //output: 0
//        String s = "loveleetcode";      //output: 2
//        String s = "aabb";      //output: -1
        System.out.println(firstUniqChar(s));
    }
}
