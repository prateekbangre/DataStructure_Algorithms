package com.geeks_for_geeks.random_question;

import java.util.Scanner;

/**
 * @author prateek.bangre on 09/08/20.
 * @Project GeeksForGeeks
 */
//URL: https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
/*
Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a
given number S.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow.
Each test case consists of two lines. The first line of each test case is N and S, where N is the size of
array and S is the sum. The second line of each test case contains N space separated integers denoting the
array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such
occuring subarray from the left if sum equals to subarray, else print -1.

Constraints:
1 <= T <= 100
1 <= N <= 107
1 <= Ai <= 1010

Example:
Input:
2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
Output:
2 4
1 5

Explanation :
Testcase1: sum of elements from 2nd position to 4th position is 12
Testcase2: sum of elements from 1st position to 5th position is 15
*/
public class Subarray_With_Given_Sum {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (0<testCases--){
            int length = scanner.nextInt();
            int sum = scanner.nextInt();

            int[] array = new int[length];
            for (int i=0; i<length; ++i){
                array[i] = scanner.nextInt();
            }

            findSubArray(array, sum);
        }
    }

    private static void findSubArray(int[] array, int sum) {

        int length = array.length;
        int start = 0;
        int total = array[0];

        for (int i=1; i<=length; ++i){

            while (total>sum && start<i-1){
                total -= array[start];
                start++;
            }

            if (total==sum){
                System.out.println((start+1)+" "+i);
                return;
            }

            if (i < length)
                total += array[i];
        }
        System.out.println("-1");
        return;
    }


}
