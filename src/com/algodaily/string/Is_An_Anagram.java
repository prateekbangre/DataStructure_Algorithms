package com.algodaily.string;

import java.util.Arrays;
import java.util.Locale;

/**
 * @author prateek.bangre on 18/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/is-an-anagram
public class Is_An_Anagram {

    private boolean isAnagram(String inputA, String inputB) {

        char[] chA = inputA.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(chA);
        char[] chB = inputB.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(chB);

        return Arrays.equals(chA, chB);
    }

    public static void main(String[] args) {

        System.out.println(new Is_An_Anagram().isAnagram("Mary", "Army"));
        System.out.println(new Is_An_Anagram().isAnagram("cinema", "iceman"));
    }
}
