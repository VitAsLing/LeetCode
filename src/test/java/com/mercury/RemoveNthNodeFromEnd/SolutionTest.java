package com.mercury.RemoveNthNodeFromEnd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testRemoveNthFromEnd() {
        Solution solution = new Solution();

        // 创建一个链表 1->2->3->4->5，删除倒数第 2 个节点（节点 4）
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode result1 = solution.removeNthFromEnd(head1, 2);
        assertEquals(1, result1.val);
        assertEquals(2, result1.next.val);
        assertEquals(3, result1.next.next.val);
        assertEquals(5, result1.next.next.next.val);
        assertNull(result1.next.next.next.next);

        // 创建一个链表 1->2->3->4->5，删除倒数第 5 个节点（节点 1）
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        ListNode result2 = solution.removeNthFromEnd(head2, 5);
        assertEquals(2, result2.val);
        assertEquals(3, result2.next.val);
        assertEquals(4, result2.next.next.val);
        assertEquals(5, result2.next.next.next.val);
        assertNull(result2.next.next.next.next);

        // 创建一个链表 1->2，删除倒数第 2 个节点（节点 1）
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);

        ListNode result3 = solution.removeNthFromEnd(head3, 2);
        assertEquals(2, result3.val);
        assertNull(result3.next);

        // 创建一个空链表
        ListNode emptyList = null;

        ListNode result4 = solution.removeNthFromEnd(emptyList, 1);
        assertNull(result4);
    }
}
