package com.random.question;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author prateek.bangre on 05/05/21.
 * @Project TestProject
 */
/*
Given two sorted linked lists, merge them so that the resulting linked list is also sorted.
Consider two sorted linked lists and the merged list below them as an example.

head1 -> 4 -> 8 -> 15 -> 19 -> null
head2 -> 7 -> 9 -> 10 -> 16 -> null

The merged linked list should look like this:
head1 -> 4 -> 7 -> 8 -> 9 -> 10 -> 15 -> 16 -> 19 -> null
*/
public class Merge_Two_Sorted_Linked_Lists {

/*
Method: Using Recursion
Merge is one of those nice recursive problems where the recursive solution code is much cleaner
than the iterative code. You probably wouldn’t want to use the recursive version for production code,
 however, because it will use stack space which is proportional to the length of the lists.

Time complexity:O(n).Only one traversal of the linked lists are needed.
Auxiliary Space:O(n).If the recursive stack space is taken into consideration.
*/
    public static Node merge_sorted(Node head1, Node head2) {

        if (head1 == null)
            return head2;
        else if (head2 == null)
            return head1;

        if (head1.data < head2.data){
            head1.next = merge_sorted(head1.next, head2);
            return head1;
        }else {
            head2.next = merge_sorted(head1, head2.next);
            return head2;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 3, 5, 6};
        int[] arr2 = new int[] {2, 4, 6, 20, 34};
//        Node list_head1 = LinkedList.create_linked_list(arr1);
        Node list_head1 = new Node(1, new Node(3, new Node(5, new Node(6, null))));
        System.out.println("Original1: "+ Arrays.toString(arr1));
//        LinkedList.display(list_head1);

//        Node list_head2 = LinkedList.create_linked_list(arr2);
        Node list_head2 = new Node(2, new Node(4, new Node(6, new Node(20, new Node(34, null)))));
        System.out.print("Original2: "+Arrays.toString(arr2));
//        LinkedList.display(list_head2);

        System.out.print("\nMerged:");

        Node newHead = merge_sorted(list_head1, list_head2);
        while (newHead != null) {
            System.out.printf("%d ", newHead.data);
            newHead = newHead.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

}
