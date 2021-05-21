package com.prateekbangre;

/**
 * @author prateek.bangre on 08/08/20.
 * @Project LeetCode
 */

//URL: https://leetcode.com/problems/zigzag-conversion/
/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int numRows);

Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
*/
public class ZigZag_Conversion {

    public static String convert(String s, int numRows) {

        int length = s.length();
        if (numRows == 1)
            return s;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i+=(numRows-1)*2) {
            result.append(s.charAt(i));
        }

        for(int j = 1; j < numRows-1; j++) {
            boolean down = true;
            for(int i = j; i < s.length();) {
                result.append(s.charAt(i));
                if(down) {
                    i += (numRows - j - 1) * 2;
                }
                else {
                    i += (numRows - 1) * 2 - (numRows - j - 1) * 2;
                }
                down = !down;
            }
        }

        for(int i = numRows - 1; i < s.length(); i += (numRows - 1)* 2) {
            result.append(s.charAt(i));

        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int numRows = 4;

        System.out.println(convert(s,numRows));
        System.out.println("PINALSIGYAHRPI");

    }
}
