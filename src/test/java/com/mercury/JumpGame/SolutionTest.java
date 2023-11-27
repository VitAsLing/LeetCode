package com.mercury.JumpGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    public void testCanJump() {
        Solution solution = new Solution();

        // 测试用例 1: 可以跳到最后
        int[] nums1 = {2, 3, 1, 1, 4};
        assertTrue(solution.canJump(nums1),
                "Failed for array where jump to end is possible");

        // 测试用例 2: 不能跳到最后
        int[] nums2 = {3, 2, 1, 0, 4};
        assertFalse(solution.canJump(nums2),
                "Failed for array where jump to end is not possible");

        // 测试用例 3: 空数组
        int[] nums3 = {};
        assertFalse(solution.canJump(nums3),
                "Failed for empty array");

        // 测试用例 4: 只有一个元素
        int[] nums4 = {0};
        assertTrue(solution.canJump(nums4),
                "Failed for single element array");

    }
}