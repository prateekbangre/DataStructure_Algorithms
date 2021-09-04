package com.algodaily.string;

/**
 * @author prateek.bangre on 18/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/sum-digits-until-one
public class Sum_Digits_Until_One {

    private int sumDigits(int input) {

        int sum = 0;
        do{
            sum = 0;
            while (input!=0){
                sum += input%10;
                input /= 10;
            }
            input = sum;
        }while (sum > 10);

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(new Sum_Digits_Until_One().sumDigits(49));
    }
}
