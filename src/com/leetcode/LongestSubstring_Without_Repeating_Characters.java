package com.prateekbangre;

import java.util.*;

/**
 * @author prateek.bangre on 08/08/20.
 * @Project LeetCode
 */
/*
//URL: https://leetcode.com/problems/longest-substring-without-repeating-characters/
*Given a string, find the length of the longest substring without repeating characters.

Example 1:
Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
* */
public class LongestSubstring_Without_Repeating_Characters {

//    public static int lengthOfLongestSubstring(String s) {
//
//        int length = s.length();
//        Set<Character> set = new HashSet<>();
//        int ans = 0, i = 0, j = 0;
//        while (i < length && j < length) {
//            if (set.contains(s.charAt(j))){
//                set.remove(s.charAt(i++));
//            }
//            else {
//                set.add(s.charAt(j++));
//                ans = Math.max(ans, j - i);
//            }
//        }
//        return ans;
//    }

    public static int lengthOfLongestSubstring(String s) {

        int length = s.length();
        int[] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);
        int start = 0, answer = 0;

        //pwwkew
        for (int end=0; end<length; ++end){
            start = Math.max(start, lastIndex[s.charAt(end)]+1);
            answer = Math.max(answer, end-start+1);
            lastIndex[s.charAt(end)] = end;
        }
        return answer;
    }

    public static void main(String[] args) {

        String s = new String("abcabcbb");
//        String s = new String("pwwkew");

        System.out.println(lengthOfLongestSubstring(s));
    }
}
