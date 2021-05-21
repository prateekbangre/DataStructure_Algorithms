package com.geeks_for_geeks.random_question;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author prateek.bangre on 19/08/20.
 * @Project GeeksForGeeks
 */
/*
URL: https://practice.geeksforgeeks.org/problems/largest-number-formed-from-an-array/0
Given a list of non negative integers, arrange them in such a manner that they form the largest number
possible.The result is going to be very large, hence return the result in the form of a string.

Input:
The first line of input consists number of the test cases. The description of T test cases is as follows:
The first line of each test case contains the size of the array, and the second line has the elements of
the array.

Output:
In each separate line print the largest number formed by arranging the elements of the array in the form
of a string.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 102
0 ≤ A[i] ≤ 103

Example:
Input:
2
5
3 30 34 5 9
4
54 546 548 60

Output:
9534330
6054854654

* */
public class Largest_Number_Formed_From_An_Array {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int noOfTest = scanner.nextInt();

        while (0<noOfTest--){
            int size = scanner.nextInt();
            String[] array = new String[size];

            for (int i = 0; i < size; i++) {
                array[i] = String.valueOf(scanner.nextInt());
            }

            Arrays.sort(array, (a,b) -> (a+b).compareTo(b+a)>0 ? -1: 1);
            System.out.println(String.join("",array));
        }
    }
}
