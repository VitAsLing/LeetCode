package com.mercury.ReverseLinkedList;


public class Solution {

    public ListNode reverseList(ListNode head) {
        return iteration(head);
    }

    public ListNode iteration(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }

        return prev;
    }


    //递归
    public ListNode recursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = recursion(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
