package com.random.question;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author prateek.bangre on 04/05/21.
 * @Project TestProject
 */
/*
url: https://www.youtube.com/watch?v=3MwRGPPB4tw&list=PLOuZYwbmgZWXvkghUyMLdI90IwxbNCiWK&index=9
Giving two string in lowercase, how many character do we need to remove to make it anagram.
Example: hello, billion  --> ans is 6 (he from hello and biin from billion)
*/
public class Make_Anagrams {

    public static int NUMBER_LETTERS = 26;

    private static int getDelta(int[] array1, int[] array2){

        if (array1.length != array2.length){
            return -1;
        }

        int delta = 0;
        for (int i=0; i<array1.length; ++i){
            int diff = Math.abs(array1[i] - array2[i]);
            delta += diff;
        }

        return delta;
    }

    private static int[] getCharCounts(String s){
        int[] charCount = new int[NUMBER_LETTERS];
        for (int i=0; i<s.length(); ++i){
            char ch = s.charAt(i);
            int offSet = (int) 'a';
            int code = ch - offSet;
            charCount[code]++;
        }
        return charCount;
    }

    private static int totalCharacterNeedToRemove(String first, String second) {
        int [] charCount1 = getCharCounts(first);
        int [] charCount2 = getCharCounts(second);
        return getDelta(charCount1, charCount2);
    }


    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String first = reader.readLine();
            String second = reader.readLine();

            System.out.println(totalCharacterNeedToRemove(first, second));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
