package com.algodaily.linkedlist;

import javax.swing.tree.TreeNode;

/**
 * @author prateek.bangre on 16/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/linked-list-to-binary-search-tree/java
public class LinkedList_to_BinarySearchTree {
    private LinkedListNode head;
    private LinkedListNode tail;

    private LinkedList_to_BinarySearchTree() {
        this.head = null;
        this.tail = null;
    }

    //The main idea of the solution is similar to merge sort.(#148 Sort List https://leetcode.com/problems/sort-list/)
    //Divide the sorted list into halves.
    //The middle of the list is root.
    //The left half of the list is the left child of root.
    //The right half of the list is the right child of root.
    //Then do the same to the left child and right child recursively.
    //Pay attention to the type: LinkedListNode TreeNode
    private TreeNode listToBST(LinkedListNode head) {

        if (head == null)
            return null;

        if (head.next == null){
            return new TreeNode(head.val);
        }

        LinkedListNode slow = head;
        LinkedListNode fast = head.next.next;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode root = new TreeNode(slow.next.val);
        LinkedListNode temp = slow.next.next;
        slow.next = null;
        root.left = listToBST(head);
        root.right = listToBST(temp);
        return root;
    }

    private void append(int val){
        LinkedListNode newNode = new LinkedListNode(val);
        if (head == null)
            head = newNode;

        if (tail == null)
            tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    private void listToString(LinkedListNode head) {

        if (head == null)
            return;
        System.out.print(head.val+" ");
        listToString(head.next);
    }

    private void preOrderTree(TreeNode root){

        if (root == null)
            return;
        System.out.print(root.val + " ");
        preOrderTree(root.left);
        preOrderTree(root.right);
    }

    public static void main(String[] args) {

        LinkedList_to_BinarySearchTree obj = new LinkedList_to_BinarySearchTree();
        obj.append(-10);
        obj.append(-3);
        obj.append(0);
        obj.append(5);
        obj.append(9);

        obj.listToString(obj.head);
        System.out.println();

        TreeNode node = obj.listToBST(obj.head);
        obj.preOrderTree(node);
    }

    class LinkedListNode {
        int val;
        LinkedListNode next;
        LinkedListNode() {}
        LinkedListNode(int val) { this.val = val; this.next = null;}
        LinkedListNode(int val, LinkedListNode next) { this.val = val; this.next = next; }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
