package com.random.question;

/**
 * @author prateek.bangre on 04/05/21.
 * @Project TestProject
 */
//url: https://www.youtube.com/watch?v=P3YID7liBug&list=PLOuZYwbmgZWXvkghUyMLdI90IwxbNCiWK&index=26
public class Binary_Search {

    //Binary Search using Iterative way
    boolean binarySearchIterative(int[] array, int x){
        int left = 0;
        int right = array.length -1;

        while (left <= right){
            int mid = left + ((right -left)/2);
            if (array[mid] == x){
                return true;
            }else if (x < array[mid]){
                right = mid -1;
            }else {
                left = mid +1;
            }
        }
        return false;
    }

    boolean binarySearchRecursive(int[] array, int x, int left, int right){

        if (left > right)
            return false;

        int mid = left + ((right-left)/2);
        if (array[mid] == x){
            return true;
        }else if(x < array[mid]){
            return binarySearchRecursive(array, x, left, mid-1);
        }else {
            return binarySearchRecursive(array, x, mid+1, right);
        }
    }

    boolean binarySearchRecursive(int[] array, int x){
        return binarySearchRecursive(array, x, 0, array.length-1);
    }

    public static void main(String[] args) {

    }
}
