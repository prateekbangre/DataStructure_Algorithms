package com.algodaily.string;

/**
 * @author prateek.bangre on 18/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/detect-substring-in-string
public class Detect_Substring_in_String {

    private int detectSubstring(String str1, String str2) {

        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 < str1.length()) {

            if (pointer2 == str2.length())
                break;

            if (str1.charAt(pointer1) == str2.charAt(pointer2)){
                pointer2++;
            }else {
                if (pointer2>0){
                    pointer1 -= pointer2;
                }
                pointer2 = 0;
            }
            pointer1++;
        }

        return pointer2 < str2.length() ? -1 : pointer1-pointer2;
    }

    public static void main(String[] args) {

        System.out.println(new Detect_Substring_in_String().detectSubstring("thepigflewwow", "flew")); // 6
        System.out.println(new Detect_Substring_in_String().detectSubstring("twocanplay", "two")); // 0
    }
}
