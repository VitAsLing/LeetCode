package com.mercury.ReverseLinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testReverseList() {
        Solution solution = new Solution();

        // 创建链表 1->2->3->4->5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // 测试迭代方法
        ListNode reversedByIteration = solution.iteration(head);
        assertEquals(5, reversedByIteration.val);
        assertEquals(4, reversedByIteration.next.val);
        assertEquals(3, reversedByIteration.next.next.val);
        assertEquals(2, reversedByIteration.next.next.next.val);
        assertEquals(1, reversedByIteration.next.next.next.next.val);

        // 测试递归方法
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversedByRecursion = solution.recursion(head);
        assertEquals(5, reversedByRecursion.val);
        assertEquals(4, reversedByRecursion.next.val);
        assertEquals(3, reversedByRecursion.next.next.val);
        assertEquals(2, reversedByRecursion.next.next.next.val);
        assertEquals(1, reversedByRecursion.next.next.next.next.val);
    }
}
