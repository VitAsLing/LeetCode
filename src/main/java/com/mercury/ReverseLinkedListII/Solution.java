package com.mercury.ReverseLinkedListII;

public class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        // 创建哑节点，方便处理头节点的特殊情况
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // 用于记录反转起始位置的前一个节点
        ListNode preLeft = dummy;

        // 移动 preLeft 指针到需要反转的起始位置的前一个节点
        for (int i = 0; i < left - 1; i++) {
            preLeft = preLeft.next;
        }

        // 定义 pre 和 current 指针，进行反转操作
        ListNode pre = preLeft.next;
        ListNode current = pre.next;

        // 进行链表反转操作，右指针 - 左指针 次数
        for (int i = 0; i < right - left; i++) {
            // 将 pre.next 指向 current 的下一个节点
            pre.next =current.next;
            // 将 current.next 指向 preLeft 的下一个节点
            current.next =preLeft.next;
            // 将 preLeft 的下一个节点指向 current
            preLeft.next = current;
            // 移动 current 指针到下一个节点
            current = pre.next;
        }
        // 返回链表的头节点
        return dummy.next;
    }
}
