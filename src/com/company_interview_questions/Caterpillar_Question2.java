package com.company_interview_questions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prateek.bangre on 20/08/21.
 * @Project DataStructure_Algorithms
 */
/*
Given a set of integers S, find any subset which adds to given target T.
Example:
S = {9, -10, 1, 4, 3, 2, 50, 12, 13, -5}
T = 20
One possible subset from the set S that gives 20 upon addition is { 12, 13,-5}
*/
public class Caterpillar_Question2 {

    private List<Integer> findSubsequence(int[] num, int target){

        List<Integer> result = new ArrayList<>();

        int sum = 0;
        int start = 0;
        int end=0;
        //{9, -10, 1, 4, 3, 2, 50, 12, 13, -5}
        while (start<num.length){

        }



        for (; end<num.length; ++end){

            sum += num[end];
            if (sum == target){
                break;
            }else if (sum > target){
                do{
                    sum -= num[start];
                    start++;
                }while (sum > target);
//                sum += num[start];
            }
        }

        for (int i=start; i<end; ++i) {
            result.add(num[i]);
        }

        return result;
    }


    public static void main(String[] args) {

        int[] num = new int[]{9, -10, 1, 4, 3, 2, 50, 12, 13, -5};
        int target = 20;

        System.out.println(new Caterpillar_Question2().findSubsequence(num, target));
    }


}
