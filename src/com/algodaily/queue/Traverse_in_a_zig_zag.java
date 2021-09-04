package com.algodaily.queue;

import java.util.*;

/**
 * @author prateek.bangre on 16/08/21.
 * @Project DataStructure_Algorithms
 */
public class Traverse_in_a_zig_zag {
    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<List<Integer>> zigZagTraversal(Node root) {
        // fill in
        // with solution
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
            return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int count = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> subList = new ArrayList<>();

            for(int i=0; i<size; ++i){
                Node node = queue.poll();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);

                subList.add(node.val);
            }
            if (count%2 != 0)
                Collections.reverse(subList);
            result.add(subList);
            count++;
        }
        return result;
    }

    private static void display(Node root){

        if (root == null)
            return;

        System.out.print(root.val);
        display(root.left);
        display(root.right);
    }

    // remove or comment if running tests (we run our own main)
    public static void main(String[] args) {

        Node root = new Node(1);
        Node root2 = new Node(2);
        Node root3 = new Node(3);
        Node root4 = new Node(4);
        Node root5 = new Node(5);
        Node root6 = new Node(6);
        Node root7 = new Node(7);
        Node root8 = new Node(8);
        root.left = root2;
        root.right = root3;

        root2.left = root4;
        root2.right = root5;

        root3.right = root6;
        root5.right = root7;
        root6.right = root8;

        System.out.println(zigZagTraversal(root));
    }
}
