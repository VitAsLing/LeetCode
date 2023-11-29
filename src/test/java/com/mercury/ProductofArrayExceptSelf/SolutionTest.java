package com.mercury.ProductofArrayExceptSelf;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testProductExceptSelf() {
        Solution solution = new Solution();

        // 测试用例 1: 普通数组
        int[] nums1 = {1, 2, 3, 4};
        int[] expectedProduct1 = {24, 12, 8, 6};
        assertArrayEquals(expectedProduct1, solution.productExceptSelf(nums1),
                "Failed for normal array");

        // 测试用例 2: 包含零的数组
        int[] nums2 = {0, 1, 2, 3, 4};
        int[] expectedProduct2 = {24, 0, 0, 0, 0};
        assertArrayEquals(expectedProduct2, solution.productExceptSelf(nums2),
                "Failed for array containing zero");

        // 测试用例 3: 所有元素相同的数组
        int[] nums3 = {2, 2, 2, 2};
        int[] expectedProduct3 = {8, 8, 8, 8};
        assertArrayEquals(expectedProduct3, solution.productExceptSelf(nums3),
                "Failed for uniform value array");
    }
}
