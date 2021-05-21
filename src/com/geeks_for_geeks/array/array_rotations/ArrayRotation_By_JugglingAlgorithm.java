package com.geeks_for_geeks.array.array_rotations;

import java.util.Arrays;

/**
 * @author prateek.bangre on 15/02/20.
 * @Project DataStructure_Algorithms
 */
/*
https://www.geeksforgeeks.org/array-rotation/
Rotate an array by K Position left.
1. First of all, divide the array by finding the GCD of d and n where d is the number of elements by which
the array has to be rotated and n is the size of the array.
2. GCD (Greatest Common Divisor) or HCF(Highest Common Factor) of d and n is the number of sets in which
the array has to be divided.
3. Move the elements within these numbers of sets.

Here is an example for n =12 and d = 3. GCD is 3 and
Let arr[] be {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}

a) Elements are first moved in first set – (See below
   diagram for this movement)
    ArrayRotation
          arr[] after this step --> {4 2 3 7 5 6 10 8 9 1 11 12}

b)    Then in second set.
          arr[] after this step --> {4 5 3 7 8 6 10 11 9 1 2 12}

c)    Finally in third set.
          arr[] after this step --> {4 5 6 7 8 9 10 11 12 1 2 3}

Time complexity : O(n)
* */
public class ArrayRotation_By_JugglingAlgorithm {

    private static int getGCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return getGCD(b, a%b);
    }

    private static void leftRotate(int[] arr, int d, int n) {

        int gcd = getGCD(d, n);
        System.out.println("GCD: "+gcd);
        int temp, j;
        for(int i = 0; i < gcd; i++) {
            temp = arr[i];
            j = i;
            while(true) {
                int x = j + d;
                if(x >= n)
                    x = x - n;
                if(x == i)
                    break;
                arr[j] = arr[x];
                j = x;
                System.out.println(Arrays.toString(arr));
            }
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {

        //int[] arr = {1, 2, 3, 4, 5, 6, 7,8,9,10,11,12};
        //int d = 3;              //rotate by d value
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;              //rotate by d value
        int n = arr.length;     //size of array

        leftRotate(arr, d, n);
        System.out.println(Arrays.toString(arr));

    }

}
