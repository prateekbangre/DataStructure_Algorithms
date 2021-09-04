package com.algodaily.linkedlist;

/**
 * @author prateek.bangre on 17/08/21.
 * @Project DataStructure_Algorithms
 */
//https://www.geeksforgeeks.org/merge-two-sorted-linked-lists-such-that-merged-list-is-in-reverse-order/
//    Input:  a: 5->10->15->40
//            b: 2->3->20
//    Output: res: 40->20->15->10->5->3->2
public class Merge_two_sorted_LL_And_Reverse_It {

    ListNode head;
    ListNode l1,l2;

    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {

        if (node1 == null && node2 == null)
            return null;

        ListNode result = null;

        while (node1 != null && node2 != null){

            if (node1.val <= node2.val){
                ListNode temp = node1.next;
                node1.next = result;
                result = node1;
                node1 = temp;
            }else {
                ListNode temp = node2.next;
                node2.next = result;
                result = node2;
                node2 = temp;
            }
        }

        while (node1 != null){
            ListNode temp = node1.next;
            node1.next = result;
            result = node1;
            node1 = temp;
        }

        while (node2 != null){
            ListNode temp = node2.next;
            node2.next = result;
            result = node2;
            node2 = temp;
        }

        return result;
    }

    void printlist(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Merge_two_sorted_LL_And_Reverse_It obj = new Merge_two_sorted_LL_And_Reverse_It();
        obj.l1 = new ListNode(5);
        obj.l1.next = new ListNode(10);
        obj.l1.next.next = new ListNode(15);
        obj.l1.next.next.next = new ListNode(40);

        obj.l2 = new ListNode(2);
        obj.l2.next = new ListNode(3);
        obj.l2.next.next = new ListNode(20);

        System.out.print("List l1 before merge: ");
        obj.printlist(obj.l1);
        System.out.println("");
        System.out.print("List l2 before merge: ");
        obj.printlist(obj.l2);

        ListNode result = obj.mergeTwoLists(obj.l1, obj.l2);
        System.out.println("");
        System.out.print("Merged linked list: ");
        obj.printlist(result);
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
