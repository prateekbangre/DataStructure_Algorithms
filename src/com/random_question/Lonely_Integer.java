package com.random.question;

/**
 * @author prateek.bangre on 04/05/21.
 * @Project TestProject
 */
/*
url: https://www.youtube.com/watch?v=eXWjCgbL01U&list=PLOuZYwbmgZWXvkghUyMLdI90IwxbNCiWK&index=10
So we have a array/list of integer which has duplicate numbers in it,
we have to file which no is present 1 time(Lonely Integer).

approach 1: using hashmap we can do and time complexity is O(n) and space als O(n)
approach 2: using Bit Manipulation
Example: i/p: {9,1,2,3,2,9,1,7,7}
o/p: 3

9  -> 1001
1  -> 0001
2  -> 0010
3  -> 0011
2  -> 0010
9  -> 1001
1  -> 0001
7  -> 0111
7  -> 0111
--------------
XOR-> 0011 -> 3
*/
public class Lonely_Integer {

    private static int findLonelyInteger(int... array){
        int result = 0;
        for(int i=0; i<array.length; ++i){
            result ^= array[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {9,1,2,3,2,9,1,7,7};
        System.out.println(findLonelyInteger(input));
    }
}
