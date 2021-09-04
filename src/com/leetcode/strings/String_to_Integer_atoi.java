package com.leetcode.strings;

/**
 * @author prateek.bangre on 08/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/
https://leetcode.com/problems/string-to-integer-atoi/
 */
public class String_to_Integer_atoi {

    private static int myAtoi(String s) {

        long result = 0;
        boolean isNegative = false;
        int i = 0;
        int len = s.length();

        // remove the blank space
        while(i < len && s.charAt(i) == ' ') {
            i++;
        }

        // check the first operator
        while((i < len) && (s.charAt(i) == '+'  || s.charAt(i) == '-')) {
            if(s.charAt(i) == '-') {
                isNegative = true;
            }
            i++;
            break;
        }

        int prev = 0;
        int base = 10;

        // add the digit else break loop + if overflow then return the high value
        while(i < s.length()) {
            if(Character.isDigit(s.charAt(i))) {
                int add = s.charAt(i) - '0';
                result = (result * base) + add;

                if (result > Integer.MAX_VALUE) {
                    return isNegative ? -Integer.MAX_VALUE-1 : Integer.MAX_VALUE;
                }
            } else {
                break;
            }
            i++;
        }

        return isNegative ? (int)-result : (int)result;
    }

    public static void main(String[] args) {
        String s = "42";
        System.out.println(myAtoi(s));
    }
}
