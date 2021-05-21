package com.geeks_for_geeks.random_question;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author prateek.bangre on 13/08/20.
 * @Project GeeksForGeeks
 */
//URL: https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1
public class Find_Triplets_With_Zero_Sum {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            if(findTriplets(a,n))
                System.out.println("1");
            else
                System.out.println("0");

        }
    }

//    Write code here for program
    private static boolean findTriplets(int[] a, int n) {
        boolean isTriplets = false;
        if (n<3)
            return isTriplets;

        Arrays.sort(a);
        int i=0, j=0;
        int sum = 0;





        return isTriplets;
    }
}
