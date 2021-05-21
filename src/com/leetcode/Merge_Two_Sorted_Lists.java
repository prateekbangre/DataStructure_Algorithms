package com.prateekbangre;

/**
 * @author prateek.bangre on 11/08/20.
 * @Project LeetCode
 */
/*
* https://leetcode.com/problems/merge-two-sorted-lists/
Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing
together the nodes of the first two lists.

Example:
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
*/
public class Merge_Two_Sorted_Lists {

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode current = result;
        while (l1!=null || l2!=null){

            if (l1 == null){
                current.next = l2;
                break;
            }

            if (l2 == null){
                current.next = l1;
                break;
            }

            if (l1.val <= l2.val){
                current.next = new ListNode(l1.val);
                l1 = l1.next;
            }else {
                current.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            current = current.next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4,null)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4,null)));

        System.out.println(mergeTwoLists(l1, l2));
    }
}
