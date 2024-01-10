package com.mercury.MergeTwoSortedLists;

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 创建哑节点
        ListNode dummy = new ListNode(-1);
        // 创建指针用于构建新的链表
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                // 将当前节点指向较小值的节点
                current.next = list1;
                // 移动 l1 指针到下一个节点
                list1 = list1.next;
            } else {
                // 将当前节点指向较小值的节点
                current.next = list2;
                // 移动 l2 指针到下一个节点
                list2 = list2.next;
            }
            // 移动 current 指针到下一个节点
            current = current.next;
        }

        // 将剩余节点直接连接到新链表的末尾
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        // 返回合并后的链表头节点
        return dummy.next;
    }
}
