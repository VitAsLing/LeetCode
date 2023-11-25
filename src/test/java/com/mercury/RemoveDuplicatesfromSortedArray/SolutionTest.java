package com.mercury.RemoveDuplicatesfromSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
   public void TestRemoveDuplicates() {
        Solution solution = new Solution();

        // 测试用例 1: 包含重复元素的数组
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        int expectedLength1 = 5; // 预期长度
        assertEquals(expectedLength1, solution.removeDuplicates(nums1),
                "Failed for array with duplicates");

        // 测试用例 2: 不包含重复元素的数组
        int[] nums2 = {1, 2, 3};
        int expectedLength2 = 3; // 预期长度
        assertEquals(expectedLength2, solution.removeDuplicates(nums2),
                "Failed for array without duplicates");

        // 测试用例 3: 空数组
        int[] nums3 = {};
        int expectedLength3 = 0; // 预期长度
        assertEquals(expectedLength3, solution.removeDuplicates(nums3),
                "Failed for empty array");
    }
}