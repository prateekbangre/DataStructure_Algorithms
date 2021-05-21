package com.company_interview_questions;

import java.util.Arrays;

/**
 * @author prateek.bangre on 12/04/21.
 * @Project TestProject
 */

/*
// Maximize the profit made obtained by the ticket collector
// Input:
// Seat[] array gives the details of available seats
// number: number of customers ready to take the seats
//
// constraints:
// odd rows will have price same as number of seats available
// even rows will have price (100 - number of seats available)
// example:
//	seats are 0 indexed.
// 	seats[]: {10,10,80,50}
// 	number: 3
// 	output: 273
// explanation:
//	consider the price for each ticket for a row
// 	seats[]; {10,10,80,50} price[]: {90,10,20,50}
//	seats[]: {9,10,80,50}   price[]: {91,10,20,50}
//	seats[]: {8,10,80,50}   price[]: {92,10,20,50}
//	hence adding the maximum price gives 90+91+92 = 273
*/
public class ZopSmartTechnology_Lead {

    public static void main(String[] args) {

        int[] seats = {1,10,80,50};
        int num=3;
        int result=0;
        int position = 0;

        for (int i = 0; i < num; i++) {
            int max = 0;
            for (int j=0;j<seats.length;++j){
                int newValue = 0;
                if (j%2==0){
                    newValue = 100-seats[j];
                }else {
                    newValue = seats[j];
                }

                if (max<newValue && seats[j]!=0){
                    max=newValue;
                    position = j;
                }
            }
            seats[position] -=1;
            result += max;
            System.out.println("seats[]=> "+ Arrays.toString(seats)+" ,max=> "+max);
        }

        System.out.println("Result=> "+result);
    }
}
