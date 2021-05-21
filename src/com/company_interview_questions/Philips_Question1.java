package com.company_interview_questions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author prateek.bangre on 11/05/21.
 * @Project TestProject
 */
/*
i/p: {(())}


(
(
{

*/
public class Philips_Question1 {

    private static boolean checkValidOrNot(String input){

        Deque<Character> value = new ArrayDeque<>();
        for (char ch : input.toCharArray()){
            char temp = 'a';
            if (!value.isEmpty()) {
                temp = (char) value.peek();
            }

            if(ch=='{' || ch=='(' || ch=='[' ){
                value.push(ch);
            }else if(ch == '}' && temp == '{'){
                value.pop();
            }else if(ch == ')' && temp == '('){
                value.pop();
            }else if(ch == ']' && temp == '['){
                value.pop();
            }else {
                value.push(ch);
            }
        }
        return value.isEmpty();
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(checkValidOrNot(input));
    }


}
