package com.algodaily.linkedlist;

import java.util.LinkedList;

/**
 * @author prateek.bangre on 16/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/delete-nodes-from-a-linked-list/java
public class Delete_Nodes_From_A_LinkedList {

    private LinkedListNode head;
    private LinkedListNode tail;

    private Delete_Nodes_From_A_LinkedList() {
        this.head = null;
        this.tail = null;
    }

    private LinkedListNode removeNodes(LinkedListNode head, int val) {

        if (head == null)
            return null;

        LinkedListNode pointer = head;
        while (pointer.next != null){
            if (pointer.next.val == val){
                pointer.next = pointer.next.next;
            }else {
                pointer = pointer.next;
            }
        }

        return head.val==val ? head.next : head;
    }

    private void prepend(int newVal) {
        // In prepend value added to the last
        LinkedListNode newNode = new LinkedListNode(newVal);
        if (head == null)
            head = newNode;
        else {
            LinkedListNode temp = head;
            head = newNode;
            head.next = temp;
        }

        if (tail == null)
            tail = newNode;

    }

    private void append(int newVal) {
        // In append value added to the start/head
        LinkedListNode newNode = new LinkedListNode(newVal);
        if (head == null)
            head = newNode;

        if (tail == null)
            tail = newNode;
        else
            tail.next = newNode;
        tail = newNode;
    }

    private void listToString(LinkedListNode head) {

        if (head == null)
            return;

        System.out.print(head.val+" ");
        listToString(head.next);
    }

    public static void main(String[] args) {
        Delete_Nodes_From_A_LinkedList linkedList3 = new Delete_Nodes_From_A_LinkedList();
        linkedList3.append(1);
        linkedList3.append(2);
        linkedList3.append(2);
        linkedList3.append(5);
        linkedList3.append(6);

        linkedList3.listToString(linkedList3.head); // "1 -> 2 -> 2 -> 5 -> 6"
        System.out.println();

        linkedList3.removeNodes(linkedList3.head, 2);
        linkedList3.listToString(linkedList3.head); // "1 -> 5 -> 6"
    }

    class LinkedListNode{
        int val;
        LinkedListNode next;
        LinkedListNode(int val) { this.val = val; this.next = null;}
        LinkedListNode(int val, LinkedListNode next) { this.val = val; this.next = next; }
    }
}
