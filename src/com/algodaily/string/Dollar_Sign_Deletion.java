package com.algodaily.string;

/**
 * @author prateek.bangre on 18/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/dollar-sign-deletion
public class Dollar_Sign_Deletion {

    private boolean isDollarDeleteEqual(String[] arr) {

        String first = getFinalStr(arr[0]);
        for (int i=1; i<arr.length; ++i){
            if (!first.equalsIgnoreCase(getFinalStr(arr[i])))
                return false;
        }
        return true;
    }

    private String getFinalStr(String str) {

        StringBuilder output = new StringBuilder();

        for (int i=0; i<str.length(); ++i){
            char ch = str.charAt(i);
            if (i!=0 && ch == '$'){
                output.deleteCharAt(output.length()-1);
            }else {
                output.append(ch);
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {

        System.out.println(new Dollar_Sign_Deletion().isDollarDeleteEqual(new String[] {"ab$$", "c$d$"}));// true
        System.out.println(new Dollar_Sign_Deletion().isDollarDeleteEqual(new String[] {"a90$n$c$se", "a90n$cse"}));// false
    }
}
