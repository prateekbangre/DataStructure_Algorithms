package com.algodaily.linkedlist;

/**
 * @author prateek.bangre on 16/08/21.
 * @Project DataStructure_Algorithms
 */
//https://algodaily.com/challenges/implement-a-linked-list/java
public class Implement_a_LinkedList {

    private LinkedListNode head;
    private LinkedListNode tail;

    private Implement_a_LinkedList() {
        this.head = null;
        this.tail = null;
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

    // remove or comment if running tests (we run our own main)
    public static void main(String[] args) {
        Implement_a_LinkedList linkedList3 = new Implement_a_LinkedList();
        linkedList3.prepend(25);
        linkedList3.prepend(15);
        linkedList3.prepend(5);
        linkedList3.prepend(9);

        linkedList3.append(15);
        linkedList3.append(5);
        linkedList3.append(9);

        linkedList3.listToString(linkedList3.head); // "9 -> 5 -> 15 -> 25 -> 15 -> 5 -> 9"
    }

    class LinkedListNode{
        int val;
        LinkedListNode next;
        LinkedListNode() {}
        LinkedListNode(int val) { this.val = val; this.next = null;}
        LinkedListNode(int val, LinkedListNode next) { this.val = val; this.next = next; }
    }
}
