package com.mercury.HIndex;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testHIndex() {
        Solution solution = new Solution();

        // 测试用例 1: 标准情况
        int[] citations1 = {3, 0, 6, 1, 5};
        int expectedHIndex1 = 3; // 至少有 3 篇论文被引用了至少 3 次
        assertEquals(expectedHIndex1, solution.hIndex(citations1),
                "Failed for standard citation array");

        // 测试用例 2: 所有论文引用次数相同
        int[] citations2 = {4, 4, 4, 4, 4};
        int expectedHIndex2 = 4; // 至少有 4 篇论文被引用了至少 4 次
        assertEquals(expectedHIndex2, solution.hIndex(citations2),
                "Failed for uniform citation array");

        // 测试用例 3: 没有任何引用
        int[] citations3 = {0, 0, 0, 0};
        int expectedHIndex3 = 0; // 没有论文被引用
        assertEquals(expectedHIndex3, solution.hIndex(citations3),
                "Failed for no citation array");

        // 测试用例 4: 单篇论文
        int[] citations4 = {100};
        int expectedHIndex4 = 1; // 至少有 1 篇论文被引用了至少 1 次
        assertEquals(expectedHIndex4, solution.hIndex(citations4),
                "Failed for single citation");

    }
}
