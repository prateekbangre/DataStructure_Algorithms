package com.algodaily.string;

/**
 * @author prateek.bangre on 18/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/reverse-only-alphabetical
public class Reverse_Only_Alphabetical {

    //using two pointer
    private String reverseOnlyAlphabetical(String input) {

        StringBuilder reverse = new StringBuilder(input);
        int p1=0;
        int p2=input.length()-1;

        while (p1<p2){

            if (Character.isAlphabetic(reverse.charAt(p1)) && Character.isAlphabetic(reverse.charAt(p2))){
                char temp = reverse.charAt(p1);
                reverse.setCharAt(p1, reverse.charAt(p2));
                reverse.setCharAt(p2, temp);
                p1++;
                p2--;
            } else if (!Character.isLetter(reverse.charAt(p1))){
                p1++;
            }else {
                p2--;
            }
        }

        return reverse.toString();
    }

    public static void main(String[] args){
        System.out.println(new Reverse_Only_Alphabetical().reverseOnlyAlphabetical("sea!$hells3"));
        //expected: sll!$ehaes3
        //output:   sll!$ehaes3
        System.out.println(new Reverse_Only_Alphabetical().reverseOnlyAlphabetical("1kas90jda3"));
        //expected: 1adj90sak3
        //output:   1adj90sak3
    }
}

