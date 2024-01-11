package com.mercury.RemoveNthNodeFromEnd;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        // 让快指针先移动 n 步
        for (int i = 0; i <= n; i++) {
            if (fast == null) {
                return head; // 链表长度小于 n，不需要删除
            }
            fast = fast.next;
        }

        // 快慢指针一起移动，直到快指针到达链表尾部
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // 删除倒数第 n 个结点
        slow.next = slow.next.next;

        return dummy.next; // 返回新的头结点
    }
}
