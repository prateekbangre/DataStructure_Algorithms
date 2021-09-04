package com.algodaily.string;

/**
 * @author prateek.bangre on 18/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/validate-palindrome
public class Validate_Palindrome {

    private boolean isPalindrome(String str) {

        if (str == null || str == "") {
            return true;
        } else {

            int start = 0;
            int end = str.length()-1;

            while (start<end){
                char ch1 = Character.toLowerCase(str.charAt(start));
                char ch2 = Character.toLowerCase(str.charAt(end));

                if (Character.isAlphabetic(ch1) && Character.isAlphabetic(ch2)){
                    if (ch1 != ch2)
                        return false;
                    ++start;
                    --end;
                }else if (!Character.isAlphabetic(ch1)){
                    ++start;
                }else {
                    --end;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Validate_Palindrome().isPalindrome("A Santa Lived As a Devil At NASA")); // true
    }
}
