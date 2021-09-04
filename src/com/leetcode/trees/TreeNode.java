package com.leetcode.trees;

/**
 * @author prateek.bangre on 08/07/21.
 * @Project DataStructure_Algorithms
 */
public class TreeNode {
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
