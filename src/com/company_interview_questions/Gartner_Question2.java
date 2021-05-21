package com.company_interview_questions;

import java.util.Scanner;

/**
 * @author prateek.bangre on 25/04/21.
 * @Project TestProject
 */
/*
Remove vowels from a string and return the string with consonants

In a town, houses are marked with English alphabets. Committee in the town wants to
renovate the houses. They decided to renovate only houses named with vowels. Committee has
given the list to members and asks them to identify the houses which are not renovated.
Write an algorithm to help the committee members to find houses which are not renovated.

Input: Input to the function contains only one argument.
House: A string representing the sequence of house markings.
Output: return a string that represents the houses which were not renovated.

*/
public class Gartner_Question2 {
    
    public static String  renovateHouses(String houses) {
        return houses.replaceAll("[AEIOUaeiou]", "");
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // input for houses
        String houses = in.nextLine();

        String result = renovateHouses(houses);
        System.out.print(result);

    }
}
