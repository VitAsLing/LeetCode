package com.mercury.LinkedListCycle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testHasCycle() {
        Solution solution = new Solution();

        // 创建一个有环的链表 3->2->0->-4->2
        ListNode headWithCycle = new ListNode(3);
        ListNode cycleStart = new ListNode(2);
        headWithCycle.next = cycleStart;
        headWithCycle.next.next = new ListNode(0);
        headWithCycle.next.next.next = new ListNode(-4);
        headWithCycle.next.next.next.next = cycleStart;

        assertTrue(solution.hasCycle(headWithCycle), "Failed for a linked list with a cycle");

        // 创建一个无环的链表 1->2->3->4->5
        ListNode headWithoutCycle = new ListNode(1);
        headWithoutCycle.next = new ListNode(2);
        headWithoutCycle.next.next = new ListNode(3);
        headWithoutCycle.next.next.next = new ListNode(4);
        headWithoutCycle.next.next.next.next = new ListNode(5);

        assertFalse(solution.hasCycle(headWithoutCycle), "Failed for a linked list without a cycle");

        // 创建一个空链表
        ListNode emptyList = null;
        assertFalse(solution.hasCycle(emptyList), "Failed for an empty list");
    }
}
