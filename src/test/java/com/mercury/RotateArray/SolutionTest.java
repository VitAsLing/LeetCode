package com.mercury.RotateArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void testRotate() {
        Solution solution = new Solution();

        // 测试用例 1: 常规旋转
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        solution.rotate(nums1, k1);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums1,
                "Failed for normal rotation");

        // 测试用例 2: k 大于数组长度
        int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = 8; // 实际旋转 3 次
        solution.rotate(nums2, k2);
        assertArrayEquals(new int[]{3, 4, 5, 1, 2}, nums2,
                "Failed for k larger than array length");

        // 测试用例 3: k 等于数组长度
        int[] nums3 = {1, 2, 3, 4};
        int k3 = 4; // 实际不发生旋转
        solution.rotate(nums3, k3);
        assertArrayEquals(new int[]{1, 2, 3, 4}, nums3,
                "Failed for k equal to array length");

        // 测试用例 4: 空数组
        int[] nums4 = {};
        int k4 = 2;
        solution.rotate(nums4, k4);
        assertArrayEquals(new int[]{}, nums4,
                "Failed for empty array");
    }
}