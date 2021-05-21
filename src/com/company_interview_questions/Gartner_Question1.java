package com.company_interview_questions;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author prateek.bangre on 25/04/21.
 * @Project TestProject
 */

/*
Print all distinct characters of a string in order
Given a string, find the all distinct (or non-repeating characters) in it. For example,
if the input string is “Geeks for Geeks”, then output should be ‘for’ and if input string is
“Geeks Quiz”, then output should be ‘GksQuiz’.

The distinct characters should be printed in same order as they appear in input string.
Examples:
Input  : alphaadida
Output : for

Input  : Hello Geeks
Output : HoGks
*/
public class Gartner_Question1 {

    // u will get correct output but bed solution
//    private static int displayUniqueCharacter(String input) {
//
//        int output = 0;
//        HashMap<Character, Integer> map = new HashMap<>();
//        for(char ch : input.toCharArray()){
//            if (map.getOrDefault(ch,0) ==0){
//                map.put(ch,1);
//            }else {
//                int temp = map.get(ch);
//                map.put(ch,++temp);
//            }
//        }
//
//        for (char key: map.keySet()){
//            if (map.get(key)==1){
////                System.out.println(key);
//                output++;
//            }
//        }
//        return output;
//    }

    //Efficient but requires two traversals: O(n)
//    Create an array count[] to store counts of characters.
//    Traverse the input string str and do following for every character x = str[i].
//    Increment count[x].
//    Traverse the input string again and do following for every character str[i]
//    If count[x] is 1, then print the unique character
//    If count[x] is greater than 1, then ignore the repeated character.
    private static int displayUniqueCharacter(String input) {

        int output = 0;
        int noOfMaxChar = 256;
        int[] count = new int[noOfMaxChar];

        int i;
        for (i=0; i<input.length(); ++i){
            if (input.charAt(i) != ' '){
                count[(int)input.charAt(i)]++;
            }
        }

        for (i=0; i<input.length(); ++i){
            if(count[(int)input.charAt(i)] == 1){
                ++output;
            }
        }
        return output;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(displayUniqueCharacter(input));
    }

}
