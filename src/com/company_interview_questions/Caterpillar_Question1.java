package com.company_interview_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author prateek.bangre on 20/08/21.
 * @Project DataStructure_Algorithms
 */
/*
{32,22,43,4,14,22,5,8,4,16,5} find the nnumber of duplicates
*/
public class Caterpillar_Question1 {

    //using hashset
    private int findDuplicateCount(int[] num){

        Set<Integer> temp = new HashSet<>();
        Set<Integer> element = new HashSet<>();
        for (int value : num ) {
            if (!temp.add(value)){
                element.add(value);
            }
        }
        return element.size();
    }

    //using hashmap
    private int findDuplicateCount1(int[] num){

        int count = 0;

        Arrays.sort(num);

        //num = [4, 4, 4, 5, 5, 8, 14, 16, 22, 22, 32, 43]
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : num){
            map.put(value, map.getOrDefault(value, 0)+1);
        }

        for (int value : map.values()){
            if (value > 1){
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {

        int[] num = new int[]{32,22,43,4,14,22,5,8,4,16,5,4};

        System.out.println(new Caterpillar_Question1().findDuplicateCount(num));
        System.out.println(new Caterpillar_Question1().findDuplicateCount1(num));
    }

}

