package com.company_interview_questions;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * @author prateek.bangre on 17/08/21.
 * @Project DataStructure_Algorithms
 */
//check linkedList is Palindrome or not
class SinglyLinkedListItem {
    public int itemData;
    public SinglyLinkedListItem next;

    public SinglyLinkedListItem(int itemData) {
        this.itemData = itemData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListItem head;
    public SinglyLinkedListItem tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertItem(int itemData) {
        SinglyLinkedListItem item = new SinglyLinkedListItem(itemData);

        if (this.head == null) {
            this.head = item;
        } else {
            this.tail.next = item;
        }

        this.tail = item;
    }
}

class Outcome {

    /*
     * Implement method/function with name 'checkPalindrome' below.
     * The function accepts following as parameters.
     *  1. a is of type SinglyLinkedList.
     * return int.
     */

    public static int checkPalindrome(SinglyLinkedList a){
        //Write your code here

        SinglyLinkedListItem slow = a.head;
        SinglyLinkedListItem fast = a.head;

        //move to mid of the SinglyLinkedListItem
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        SinglyLinkedListItem prev, temp;

        prev = slow;
        slow = slow.next;
        prev.next = null;
        while(slow != null){
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        fast = a.head;
        slow = prev;
        while(slow != null){
            if(fast.itemData != slow.itemData)
                return 0;

            fast = fast.next;
            slow = slow.next;
        }

        return 1; //return type "int".
    }

}

public class Intuit_Question1 {
    public static void main(String[] args) throws IOException {
        SinglyLinkedList a = new SinglyLinkedList();
        a.insertItem(6);
        a.insertItem(1);
        a.insertItem(5);
        a.insertItem(1);
        a.insertItem(6);

        int outcome = Outcome.checkPalindrome(a);
        System.out.println(outcome);
    }
}
