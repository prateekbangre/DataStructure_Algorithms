package com.geeks_for_geeks.random_question;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

/**
 * @author prateek.bangre on 09/08/20.
 * @Project GeeksForGeeks
 */
//URL: https://practice.geeksforgeeks.org/problems/level-order-traversal/1
class Level_Order_Traversal {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    static Node buildTree(String str){

        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while(queue.size()>0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if(!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if(i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if(!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data+" ");

        printInorder(root.right);
    }

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        while(t > 0){
            String s = br.readLine();
            Node root = buildTree(s);
            ArrayList <Integer> res = levelOrder(root);
            for (Integer num : res) System.out.print(num + " ");
            System.out.println();
            t--;

        }
    }

//    write code here for the program
    private static ArrayList <Integer> levelOrder(Node node)
    {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()){
            Node temp = queue.poll();
            result.add(temp.data);

            if(temp.left != null)
                queue.add(temp.left);

            if(temp.right != null)
                queue.add(temp.right);
        }

        return result;
    }

}
