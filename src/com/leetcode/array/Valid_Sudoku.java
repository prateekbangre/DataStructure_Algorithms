package com.leetcode.array;

import java.util.HashSet;

/**
 * @author prateek.bangre on 07/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/
https://leetcode.com/problems/valid-sudoku/
 */
public class Valid_Sudoku {

    private static boolean isValidSudoku(char[][] board) {

        HashSet set = new HashSet<String>();
        for (int i=0; i< board.length; ++i){
            for (int j=0; j< board[0].length; ++j){

                char number = board[i][j];
                if (number != '.'){

                    String row = number + " in row "+ i;
                    String col = number + " in col "+ j;
                    String block = number + " in block "+ i/3 +"-"+ j/3;

                    if ( !set.add(row) || !set.add(col) || !set.add(block)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        char[][] board = new char[][]{  {'8','3','.','.','7','.','.','.','.'}
                                        ,{'6','.','.','1','9','5','.','.','.'}
                                        ,{'.','9','8','.','.','.','.','6','.'}
                                        ,{'8','.','.','.','6','.','.','.','3'}
                                        ,{'4','.','.','8','.','3','.','.','1'}
                                        ,{'7','.','.','.','2','.','.','.','6'}
                                        ,{'.','6','.','.','.','.','2','8','.'}
                                        ,{'.','.','.','4','1','9','.','.','5'}
                                        ,{'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(board));
    }
}
