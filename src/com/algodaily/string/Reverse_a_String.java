package com.algodaily.string;

import java.util.Arrays;

/**
 * @author prateek.bangre on 18/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/reverse-a-string/java
public class Reverse_a_String {

    //normal brutal approach
    private String reverseString(String str) {

        StringBuilder reverse = new StringBuilder();
        for (int i=str.length()-1; i>=0; --i) {
            reverse.append(str.charAt(i));
        }

        return reverse.toString();
    }

    //using recursive
    private String reverseString1(String str) {

        if (str.length() == 0)
            return "";
        return str.charAt(str.length()-1) + reverseString1(str.substring(0, str.length()-1));
    }

    //using 2 pointer
    private String reverseString2(String str) {

        StringBuilder reverse = new StringBuilder(str);

        for (int p1=0, p2=str.length()-1; p1<str.length()/2 ; ++p1){
            char temp = reverse.charAt(p1);
            reverse.setCharAt(p1, reverse.charAt(p2-p1));
            reverse.setCharAt(p2-p1, temp);
        }
        return reverse.toString();
    }


    public static void main(String[] args) {
        System.out.println(new Reverse_a_String().reverseString("thisisatest"));
        System.out.println(new Reverse_a_String().reverseString1("abcdef"));
        System.out.println(new Reverse_a_String().reverseString1("a1b2c3d4"));
    }
}
