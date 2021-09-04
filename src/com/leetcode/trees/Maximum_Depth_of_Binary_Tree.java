package com.leetcode.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author prateek.bangre on 08/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/555/

 */
public class Maximum_Depth_of_Binary_Tree {

    // using recursive
    private static int maxDepth(TreeNode root) {
        //if the node does not exist, simply return 0. Otherwise, return the 1+the longer distance of its subtree.
        if (root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    // using BFT
    private static int maxDepth_BFT(TreeNode root) {

        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                size--;
            }
            count++;
        }
        return count;
    }

    // using DFT
    private static int maxDepth_DFT(TreeNode root) {
        if (root == null)
            return 0;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> value = new Stack<>();

        stack.push(root);
        value.push(1);
        int max = 0;

        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            int temp = value.pop();
            max = Math.max(temp, max);

            if (node.left != null){
                stack.push(node.left);
                value.push(temp+1);
            }
            if (node.right != null){
                stack.push(node.right);
                value.push(temp+1);
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        int[] root = new int[]{3,9,20,null,null,15,7};

        TreeNode left1 = new TreeNode(9);
        TreeNode right1 = new TreeNode(20,new TreeNode(15),new TreeNode(7));
        TreeNode root = new TreeNode(3,left1,right1);

        System.out.println(maxDepth(root));
        System.out.println(maxDepth_BFT(root));
        System.out.println(maxDepth_DFT(root));

        System.out.println("abc".equals("ABC"));
    }
}
