package com.company_interview_questions;

import java.util.*;

/**
 * @author prateek.bangre on 19/08/21.
 * @Project DataStructure_Algorithms
 */
//https://www.csestack.org/coding-challenge-special-elements-in-matrix/
public class GoldmanSachs_Question1 {

    public static int[][] matrix1 = {
            {1, 3, 4},
            {5, 2, 9},
            {8, 7, 6}
    };
//    public static int[][] matrix1 = {
//            {1, 4, 9},
//            {2, 5, 7}
//    };
//    public static int[][] matrix1 = {
//            {1, 2, 1},
//            {3, 5, 7},
//            {8, 9, 6}
//    };

    public int countSpecialElements (List<List<Integer>> matrix) {

        // matrix.stream().forEach(ch -> {
        // ch.forEach( s -> System.out.print(s));
        // System.out.println();
        // });

        Set<Integer> element = new HashSet<>();

        int rLength = matrix.size();
        int cLength = matrix.get(0).size();

        for(int i=0; i<rLength; ++i){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int j=0; j<cLength; ++j){
                int value = matrix.get(i).get(j);
                if(value >  max)
                    max = value;
                if(value < min)
                    min = value;
            }
            element.add(max);
            element.add(min);
        }


        for(int j=0; j<cLength; ++j){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i=0; i<rLength; ++i){

                int value = matrix.get(i).get(j);
                if(value >  max)
                    max = value;
                if(value < min)
                    min = value;
            }
            element.add(max);
            element.add(min);
        }
        return element.size();
    }

    static int countPositional1(int a[][], int m, int n)
    {
        // rwomax[i] is going to store maximum of
        // i-th row and other arrays have similar
        // meaning
        int rowmax[] = new int[m];
        int rowmin[] = new int[m];
        int colmax[] = new int[n];
        int colmin[] = new int[n];

        // Find rminn and rmaxx for every row
        for (int i = 0; i < m; i++) {
            int rminn = Integer.MAX_VALUE;
            int rmaxx = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                if (a[i][j] > rmaxx)
                    rmaxx = a[i][j];
                if (a[i][j] < rminn)
                    rminn = a[i][j];
            }
            rowmax[i] = rmaxx;
            rowmin[i] = rminn;
        }

        // Find cminn and cmaxx for every column
        for (int j = 0; j < n; j++) {
            int cminn = Integer.MAX_VALUE;
            int cmaxx = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                if (a[i][j] > cmaxx)
                    cmaxx = a[i][j];
                if (a[i][j] < cminn)
                    cminn = a[i][j];
            }

            colmax[j] = cmaxx;
            colmin[j] = cminn;
        }

        // Check for optimal element
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((a[i][j] == rowmax[i])
                        || (a[i][j] == rowmin[i])
                        || (a[i][j] == colmax[j])
                        || (a[i][j] == colmin[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(3, 5, 7)));
        matrix.add(new ArrayList<>(Arrays.asList(8, 9, 6)));

        System.out.println(new GoldmanSachs_Question1().countSpecialElements(matrix));
        System.out.println(new GoldmanSachs_Question1().countPositional1(matrix1, 3,3));
    }
}
