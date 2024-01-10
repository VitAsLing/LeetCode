package com.mercury.MergeTwoSortedLists;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testMergeTwoLists() {
        Solution solution = new Solution();

        // 创建第一个有序链表 1->2->4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // 创建第二个有序链表 1->3->4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // 合并两个有序链表
        ListNode merged = solution.mergeTwoLists(list1, list2);

        // 验证合并后的链表 1->1->2->3->4->4
        assertEquals(1, merged.val);
        assertEquals(1, merged.next.val);
        assertEquals(2, merged.next.next.val);
        assertEquals(3, merged.next.next.next.val);
        assertEquals(4, merged.next.next.next.next.val);
        assertEquals(4, merged.next.next.next.next.next.val);
        assertNull(merged.next.next.next.next.next.next); // 验证链表结束
    }
}
