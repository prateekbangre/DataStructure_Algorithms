package com.random.question;

import java.util.HashSet;

/**
 * @author prateek.bangre on 05/05/21.
 * @Project TestProject
 */
/*
url: https://www.educative.io/m/find-the-missing-number
You are given an array of positive numbers from 1 to n, such that all numbers
from 1 to n are present except one number x. You have to find x. The input array is not sorted.
Look at the below array and give it a try before checking the solution.
Example:

Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
Output: 5
Explanation: The missing number from 1 to 8 is 5

Input: arr[] = {1, 2, 3, 5}
Output: 4
Explanation: The missing number from 1 to 5 is 4
*/
public class Find_Missing_No {
/*
Runtime Complexity: Linear, O(n).
Memory Complexity: Constant, O(1).

Solution Breakdown
A naive solution is to simply search for every integer between 1 and n in the input array, stopping
the search as soon as there is a missing number. Since the input array is not sorted, its time complexity
 will be O(n^2).

Can you do better than O(n^2)? Yes.

You could sort the array and then do a linear scan O(n) where you compare all consecutive elements to find the missing number. However, the time complexity of this algorithm is O(n log n) due to the time spent in sorting.

You can do better. Here is a linear, O(n), solution that uses the arithmetic series sum formula.

Sum (1 - n) = (n *(n + 1))
              ------------
                    2
ere are the steps to find the missing number.

Find the sum ‘sum_of_elements’ of all the numbers in the array. This would require a linear scan, O(n).
Then find the sum ‘expected_sum’ of first ‘n’ numbers using the arithmetic series sum formula i.e. ( n * (n + 1) ) / 2.
The difference between these i.e. ‘expected_sum - sum_of_elements’, is the missing number in the array.
*/

    private static int findAllMissingNumber(int... numbers){

        // calculate sum of all elements
        // in input list
        int sum_of_elements = 0;
        for (Integer x : numbers) {
            sum_of_elements += x;
        }

        // There is exactly 1 number missing
        int n = numbers.length + 1;
        int actual_sum = (n * ( n + 1 ) ) / 2;
        return actual_sum - sum_of_elements;
    }

    public static void main(String[] args) {
        int [] a ={1, 2, 3, 5};
        System.out.println(findAllMissingNumber(a));
    }

    /**
     * @author prateek.bangre on 05/05/21.
     * @Project TestProject
     */
    /*
    url: https://www.educative.io/m/sum-of-two-values
    Given an array of integers and a value, determine if there are any two integers in the array
    whose sum is equal to the given value. Return true if the sum exists and return false if it does not.
    Consider this array and the target sums:

    i/p: array-> 5,7,1,28,4,3
         find -> 10

    o/p: true -> (7,3) (2,8)

    Solution Explanation
    Runtime Complexity: The runtime complexity of this solution is linear, O(n).
    Memory Complexity: The memory complexity of this solution is linear, O(n).

    Solution Breakdown
    In this solution, you can use the following algorithm to find a pair that add up to the target (say val).

    Scan the whole array once and store visited elements in a hash set.
    During scan, for every element e in the array, we check if val - e is present
    in the hash set i.e. val - e is already visited.
    If val - e is found in the hash set, it means there is a pair (e, val - e) in array
    whose sum is equal to the given val.
    If we have exhausted all elements in the array and didn’t find any such pair,
    the function will return false.
    */
    public static class Sum_of_Two_Values {

        static boolean findSumOfTwo(int[] numbers, int find) {
            HashSet<Integer> foundValue = new HashSet<>();
            for(int no : numbers){
                if (foundValue.contains(find - no)){
                    return true;
                }
                foundValue.add(no);
            }
            return false;
        }

        public static void main(String[] args) {
            int[] numbers = new int[] {5, 7, 1, 2, 8, 4, 3};
            int find = 3;

            System.out.println(findSumOfTwo(numbers, find));
        }
    }
}
