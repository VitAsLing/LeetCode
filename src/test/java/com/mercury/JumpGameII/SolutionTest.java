package com.mercury.JumpGameII;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testJump() {
        Solution solution = new Solution();

        // 测试用例 1: 需要多次跳跃
        int[] nums1 = {2, 3, 1, 1, 4};
        int expectedJumps1 = 2; // 第一次跳到位置 1，第二次跳到末尾
        assertEquals(expectedJumps1, solution.jump(nums1),
                "Failed for array requiring multiple jumps");

        // 测试用例 2: 最大跳跃直接到达末尾
        int[] nums2 = {2, 1};
        int expectedJumps2 = 1; // 只需要一次跳跃
        assertEquals(expectedJumps2, solution.jump(nums2),
                "Failed for array where single jump is enough");

        // 测试用例 3: 已经在末尾
        int[] nums3 = {0};
        int expectedJumps3 = 0; // 已经在末尾，不需要跳跃
        assertEquals(expectedJumps3, solution.jump(nums3),
                "Failed for array with no need to jump");

    }
}
