package com.geeks_for_geeks.random_question;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author prateek.bangre on 10/08/20.
 * @Project GeeksForGeeks
 */
//URL: https://practice.geeksforgeeks.org/problems/first-repeating-element/0
public class First_Repeating_Element {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int noOfTest = scanner.nextInt();

        while (0<noOfTest--){
            int length = scanner.nextInt();
            int[] array = new int[length];

            for (int i=0; i<length; ++i){
                array[i] =scanner.nextInt();
            }

            firstRepeatIndex(array);
        }
    }

    private static void firstRepeatIndex(int[] array) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> unique = new HashSet<>();

        for (int i = 0; i < array.length; i++) {

            if (unique.contains(array[i])){
                System.out.println(map.get(array[i]));
                return;
            }else {
                unique.add(array[i]);
                map.put(array[i], i+1);
            }
        }
        System.out.println("-1");
    }
}
