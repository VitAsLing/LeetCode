package com.mercury.RemoveDuplicatesFromSortedArrayII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testRemoveDuplicates() {
        Solution solution = new Solution();

        // 测试用例 1: 包含多个重复元素的数组
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int expectedLength1 = 5; // 预期长度为 5
        assertEquals(expectedLength1, solution.removeDuplicates(nums1),
                "Failed for array with multiple duplicates");

        // 测试用例 2: 不包含重复元素的数组
        int[] nums2 = {1, 2, 3, 4, 5};
        int expectedLength2 = 5; // 预期长度为 5
        assertEquals(expectedLength2, solution.removeDuplicates(nums2),
                "Failed for array without duplicates");

        // 测试用例 3: 空数组
        int[] nums3 = {};
        int expectedLength3 = 0; // 预期长度为 0
        assertEquals(expectedLength3, solution.removeDuplicates(nums3),
                "Failed for empty array");

        // 测试用例 4: 只有一个元素的数组
        int[] nums4 = {1};
        int expectedLength4 = 1; // 预期长度为 1
        assertEquals(expectedLength4, solution.removeDuplicates(nums4),
                "Failed for single element array");

        // 测试用例 5: 只有两个相同元素的数组
        int[] nums5 = {2, 2};
        int expectedLength5 = 2; // 预期长度为 2
        assertEquals(expectedLength5, solution.removeDuplicates(nums5),
                "Failed for array with two same elements");
    }
}