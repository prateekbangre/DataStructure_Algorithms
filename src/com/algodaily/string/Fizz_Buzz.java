package com.algodaily.string;

/**
 * @author prateek.bangre on 18/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/fizz-buzz
public class Fizz_Buzz {

    private String fizzBuzz(Integer num) {

        StringBuilder result = new StringBuilder();

        for (int i=1; i<=num; ++i){
            if (i%3 == 0 && i%5 ==0 )
                result.append("fizzbuzz");
            else if (i%3 == 0 )
                result.append("fizz");
            else if (i%5 ==0 )
                result.append("buzz");
            else
                result.append(i);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Fizz_Buzz().fizzBuzz(15));
    }
}
