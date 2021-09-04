package com.algodaily.string;

/**
 * @author prateek.bangre on 18/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/find-first-non-repeating-character
public class Find_First_Non_Repeating_Character {

    private char firstNonRepeat(String str) {

        int[] count = new int[26];
        for (char ch : str.toCharArray()){
            count[ch-97] += 1;
        }

        for (int i=0; i<count.length; ++i){
            if (count[i] == 1){
                return (char)(97+i);
            }
        }

        return 'a';
    }

    public static void main(String[] args) {

        System.out.println(String.valueOf(new Find_First_Non_Repeating_Character().firstNonRepeat("asdfsdafdasfjdfsafnnunl"))); // j
    }
}
