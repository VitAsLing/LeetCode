package com.mercury.CopyListWithRandomPointer;

public class SolutionTest {

    public static void main(String[] args) {
        testCopyRandomList();
    }

    private static void testCopyRandomList() {
        Solution solution = new Solution();

        // 创建链表节点
        Solution.Node node1 = new Solution.Node(1);
        Solution.Node node2 = new Solution.Node(2);
        Solution.Node node3 = new Solution.Node(3);
        Solution.Node node4 = new Solution.Node(4);

        // 构建原始链表：1 -> 2 -> 3 -> 4
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // 设置随机指针
        node1.random = node3;
        node2.random = node1;
        node3.random = node2;
        node4.random = node4;

        // 调用方法进行复制
        Solution.Node copiedHead = solution.copyRandomList(node1);

        // 检查复制后的链表
        assertNodesEqual(node1, copiedHead);
    }

    private static void assertNodesEqual(Solution.Node original, Solution.Node copy) {
        while (original != null && copy != null) {
            // 检查节点值是否相等
            assert original.val == copy.val : "Node values are not equal";

            // 检查 random 指针是否指向相同的节点或为 null
            if (original.random == null) {
                assert copy.random == null : "Random pointers are not equal";
            } else {
                assert original.random.val == copy.random.val : "Random pointers are not equal";
            }

            // 移动到下一个节点
            original = original.next;
            copy = copy.next;
        }

        // 检查两个链表是否同时为 null，如果不是，说明链表长度不一致
        assert original == null && copy == null : "Lists have different lengths";
    }
}
