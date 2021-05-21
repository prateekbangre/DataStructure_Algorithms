package com.geeks_for_geeks.random_question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author prateek.bangre on 09/08/20.
 * @Project GeeksForGeeks
 */
//URL: https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x/0
/*
Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all
pairs from both arrays whose sum is equal to X.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow.
Each test case contains 3 lines . The first line contains 3 space separated integers N, M, X. Then in the
next two lines are space separated values of the array A and B respectively.

Output:
For each test case in a new line print the sorted space separated values of all the pairs u,v where u
belongs to array A and v belongs to array B, such that each pair is separated from the other by a ','
without quotes also add a space after the ',' . If no such pair exist print -1.

Constraints:
1 <= T <= 100
1 <= N, M, X <= 106
-106 <= A, B <= 106

Example:
Input:
2
5 5 9
1 2 4 5 7
5 6 3 4 8
2 2 3
0 2
1 3
Output:
1 8, 4 5, 5 4
0 3, 2 1

Explanation:
Testcase 1: (1, 8), (4, 5), (5, 4) are the pairs which sum to 9.
* */
public class Find_All_Pairs_With_A_Given_Sum {

    static class Pair{
        int u, v;
        Pair(int u, int v){
            this.u = u;
            this.v = v;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int noOfTest = scanner.nextInt();

        while (0<noOfTest--){
            int length_A = scanner.nextInt();
            int length_B = scanner.nextInt();
            int sum_X = scanner.nextInt();

            ArrayList<Pair> result = new ArrayList<>();

            HashSet<Integer> array_A = new HashSet<>();
            for (int i=0; i<length_A; ++i)
                array_A.add(scanner.nextInt());

            for (int i=0; i<length_B; ++i) {
                int data = scanner.nextInt();

                if (array_A.contains(sum_X-data)){
                    result.add(new Pair(sum_X-data, data));
                }
            }

            if (result.isEmpty()){
                System.out.println("-1");
                continue;
            }

            result.sort((o1, o2) -> o1.u-o2.u);

//            result.forEach( pair -> System.out.println(pair.u +" "+pair.v));

            boolean isFirst = true;
            for (Pair pair: result){
                if (!isFirst){
                    System.out.print(", ");
                }
                System.out.print(pair.u+" "+pair.v);
                isFirst = false;
            }
            System.out.println();
        }
    }
}
