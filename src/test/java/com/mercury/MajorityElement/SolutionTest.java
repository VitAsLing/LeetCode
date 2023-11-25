package com.mercury.MajorityElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void testMajorityElement() {
        Solution solution = new Solution();

        // 测试用例 1: 明确的多数元素
        int[] nums1 = {3, 3, 4, 2, 3, 3, 3};
        int expectedMajor1 = 3;
        assertEquals(expectedMajor1, solution.majorityElement(nums1),
                "Failed for array with a clear majority element");

        // 测试用例 2: 所有元素都相同
        int[] nums2 = {1, 1, 1, 1};
        int expectedMajor2 = 1;
        assertEquals(expectedMajor2, solution.majorityElement(nums2),
                "Failed for array where all elements are same");

        // 测试用例 3: 只有一个元素
        int[] nums3 = {2};
        int expectedMajor3 = 2;
        assertEquals(expectedMajor3, solution.majorityElement(nums3),
                "Failed for single element array");
    }
}