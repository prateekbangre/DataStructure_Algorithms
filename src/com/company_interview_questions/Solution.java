package com.company_interview_questions;

/**
 * @author prateek.bangre on 31/08/21.
 * @Project DataStructure_Algorithms
 */


public class Solution {
    static int solve(int N){
        // Type your code here

        int a = 0, b = 0;
        while(N > 0){
            if(validSpecialNo(N)){
                a++;
                N = 0;
            }else if( N%5 == 0){
                b++;
                N -= 5;
            } else if( N%4 == 0){
                a++;
                N -= 4;
            }else{
                a++;
                N -= 4;
            }
        }

        if(N < 0)
            return -1;
        else
            return a+b;

    }

    static boolean validSpecialNo(int n){

        while(n>0){
            int digit = n%10;
            n = n/10;
            if(!(digit == 5 || digit == 4)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solve(49));
    }
}