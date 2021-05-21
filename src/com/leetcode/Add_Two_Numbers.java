package com.prateekbangre;

import java.util.List;

/**
 * @author prateek.bangre on 08/08/20.
 * @Project LeetCode
 */
/*
//URL: https://leetcode.com/problems/add-two-numbers/
* You are given two non-empty linked lists representing two non-negative integers. The digits are stored
in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a
linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
* */
public class Add_Two_Numbers {

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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode first = l1;
        ListNode second = l2;

        ListNode curr = result;
        int carry = 0;
        while (first != null || second != null) {

            int x = (first != null) ? first.val : 0;
            int y = (second != null) ? second.val : 0;

            int sum = carry + x + y;

            carry = sum / 10;

            curr.next = new ListNode(sum % 10);

            curr = curr.next;

            if (first != null)
                first = first.next;

            if (second != null)
                second = second.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3,null)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4,null)));

        System.out.println(addTwoNumbers(l1, l2));
    }

}
