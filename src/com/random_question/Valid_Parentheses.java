package com.random.question;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author prateek.bangre on 11/05/21.
 * @Project TestProject
 */
/*
url: https://leetcode.com/problems/valid-parentheses/submissions/
*/
public class Valid_Parentheses {

    private static boolean isValid(String s) {
        Deque<Character> value = new ArrayDeque<>();
        for (char ch : s.toCharArray()){
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

        System.out.println(isValid(input));
    }
}
