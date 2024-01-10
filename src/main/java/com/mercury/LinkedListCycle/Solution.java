package com.mercury.LinkedListCycle;

public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // 链表为空或只有一个节点，不存在环
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false; // 快指针走到了链表尾部，不存在环
            }
            slow = slow.next; // 慢指针移动一步
            fast = fast.next.next; // 快指针移动两步
        }

        return true; // 快慢指针相遇，链表存在环
    }


}
