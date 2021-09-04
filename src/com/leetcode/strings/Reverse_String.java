package com.leetcode.strings;

import java.util.Arrays;

/**
 * @author prateek.bangre on 07/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
https://leetcode.com/problems/reverse-string/
Write a function that reverses a string. The input string is given as an array of characters s.
Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
 */
public class Reverse_String {

    private static void reverseString(char[] s) {

        for(int pointer1=0,pointer2=s.length-1; pointer1<pointer2; ++pointer1,--pointer2){
            char temp = s[pointer1];
            s[pointer1] = s[pointer2];
            s[pointer2] = temp;
        }

    }

    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};       //output: [o, l, l, e, h]
//        char[] s = new char[]{'H','a','n','n','a','h'};     //output: [h, a, n, n, a, H]
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
