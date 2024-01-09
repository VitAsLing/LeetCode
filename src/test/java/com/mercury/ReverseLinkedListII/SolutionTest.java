package com.mercury.ReverseLinkedListII;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testReverseBetween() {
        Solution solution = new Solution();

        // 构建链表 1->2->3->4->5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // 测试反转整个链表
        ListNode reversedWholeList = solution.reverseBetween(head, 1, 5);
        assertEquals(5, reversedWholeList.val);
        assertEquals(4, reversedWholeList.next.val);
        assertEquals(3, reversedWholeList.next.next.val);
        assertEquals(2, reversedWholeList.next.next.next.val);
        assertEquals(1, reversedWholeList.next.next.next.next.val);

        // 测试反转部分链表
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversedPartList = solution.reverseBetween(head, 2, 4);
        assertEquals(1, reversedPartList.val);
        assertEquals(4, reversedPartList.next.val);
        assertEquals(3, reversedPartList.next.next.val);
        assertEquals(2, reversedPartList.next.next.next.val);
        assertEquals(5, reversedPartList.next.next.next.next.val);
    }
}
