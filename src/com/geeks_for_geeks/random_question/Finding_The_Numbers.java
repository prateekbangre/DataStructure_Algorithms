package com.geeks_for_geeks.random_question;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author prateek.bangre on 14/08/20.
 * @Project GeeksForGeeks
 */
//URL: https://practice.geeksforgeeks.org/problems/finding-the-numbers/0
public class Finding_The_Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int noOfTest = scanner.nextInt();

        while (0<noOfTest--){

            int size = scanner.nextInt();
            int[] array = new int[2*size + 2];
            for (int i = 0; i < (2*size + 2); i++) {
                array[i] = scanner.nextInt();
            }

            findTheNo(array);
        }
    }

    private static void findTheNo(int[] array) {

        Arrays.sort(array);
        int i=0;
        while (i < array.length){

            if ((i < array.length-1) && array[i] == array[i+1]){
                i += 2;
            }else{
                System.out.print(array[i]+" ");
                i++;
            }
        }
        System.out.println();
    }
}
