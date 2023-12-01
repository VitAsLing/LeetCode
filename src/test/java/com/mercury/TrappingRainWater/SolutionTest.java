package com.mercury.TrappingRainWater;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testTrap() {
        Solution solution = new Solution();

        // 测试用例 1: 普通情况
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expectedTrap1 = 6;
        assertEquals(expectedTrap1, solution.trap(height1),
                "Failed for normal height array");

        // 测试用例 2: 平坦的表面
        int[] height2 = {2, 2, 2, 2};
        int expectedTrap2 = 0; // 平坦表面不会积水
        assertEquals(expectedTrap2, solution.trap(height2),
                "Failed for flat surface");

        // 测试用例 3: 单调递增
        int[] height3 = {1, 2, 3, 4};
        int expectedTrap3 = 0; // 单调递增不会积水
        assertEquals(expectedTrap3, solution.trap(height3),
                "Failed for monotonically increasing height");

        // 测试用例 4: 单调递减
        int[] height4 = {4, 3, 2, 1};
        int expectedTrap4 = 0; // 单调递减不会积水
        assertEquals(expectedTrap4, solution.trap(height4),
                "Failed for monotonically decreasing height");
    }
}
