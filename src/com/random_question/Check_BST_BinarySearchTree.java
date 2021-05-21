package com.random.question;

/**
 * @author prateek.bangre on 04/05/21.
 * @Project TestProject
 */
/*
url: https://www.youtube.com/watch?v=i_Q0v_Ct5lY&list=PLOuZYwbmgZWXvkghUyMLdI90IwxbNCiWK&index=22
Time Complexity: O(n)
Space Complexity: O(height), recursion stack space in worst case = O(n)
*/
public class Check_BST_BinarySearchTree {

    boolean checkBST(Node root, int min, int max){

        if (root == null){
            return true;
        }

        if (root.data < min || root.data > max){
            return false;
        }

        return checkBST(root.left, min, root.data-1) && checkBST(root.right, root.data+1, max);
    }

    boolean checkBST(Node root){
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }


    public static void main(String[] args) {

    }

    class Node{
        int data;
        Node left;
        Node right;

        Node(){
            this.data = -1;
            this.left = null;
            this.right = null;
        }
    }
}
