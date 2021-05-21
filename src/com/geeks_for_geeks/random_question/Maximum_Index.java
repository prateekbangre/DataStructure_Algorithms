package com.geeks_for_geeks.random_question;

import java.util.Scanner;

/**
 * @author prateek.bangre on 14/08/20.
 * @Project GeeksForGeeks
 */
//URL: https://practice.geeksforgeeks.org/problems/maximum-index/0
public class Maximum_Index {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int noOfTest = scanner.nextInt();

        while (0<noOfTest--){
            int size = scanner.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println(findMaximumIndex(array, size));
        }
    }

    private static int findMaximumIndex(int[] array, int size) {

        int maxIndex = 0;
        for (int i = 0; i < size; i++) {

            for (int j = size-1; j > i; j--) {
                if (array[i] <= array[j] && maxIndex < (j-i)){
                    maxIndex = j-i;
                }
            }
        }
        return maxIndex;
    }
}
