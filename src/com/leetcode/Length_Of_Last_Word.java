package com.prateekbangre;

/**
 * @author prateek.bangre on 16/08/20.
 * @Project LeetCode
 */
/*
URL: https://leetcode.com/problems/length-of-last-word/
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the l
ength of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.
Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:
Input: "Hello World"
Output: 5
* */
public class Length_Of_Last_Word {

    public static int lengthOfLastWord(String s) {
        if(s.trim().isEmpty()){
            return 0;
        }

        //Slow way
//        String[] str = s.trim().split(" ");
//        return str[str.length-1].length();

        //fast way
        return s.trim().substring(s.trim().lastIndexOf(" ")).length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
