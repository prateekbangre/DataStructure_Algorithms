package com.leetcode.strings;

import java.util.Locale;

/**
 * @author prateek.bangre on 08/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
https://leetcode.com/problems/valid-palindrome/
Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */
public class Valid_Palindrome {

    //using normal way
    private static boolean isPalindrome(String s) {

        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int length = s.length();
        for (int i=0; i<length/2; ++i){
            if (s.charAt(i) != s.charAt(length-1-i))
                return false;
        }
        return true;
    }

    //using two pointer
    private static boolean isPalindrome1(String s) {

        int head = 0;
        int tail = s.length()-1;

        while (head<tail){
            char ch1 = s.charAt(head);
            char ch2 = s.charAt(tail);

            if (!Character.isLetterOrDigit(ch1)){
                ++head;
            }else if (!Character.isLetterOrDigit(ch2)){
                --tail;
            }else {
                if (Character.toLowerCase(ch1) != Character.toLowerCase(ch2)) {
                        return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
        System.out.println(isPalindrome1(s));
    }
}
