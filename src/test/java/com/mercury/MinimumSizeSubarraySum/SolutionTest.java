package com.mercury.MinimumSizeSubarraySum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testMinSubArrayLenWhenSubarrayExists() {
        Solution solution = new Solution();

        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        assertEquals(2, solution.minSubArrayLen(target1, nums1),
                "Failed for target: 7 and nums: [2, 3, 1, 2, 4, 3]");

        int[] nums2 = {1, 4, 4};
        int target2 = 4;
        assertEquals(1, solution.minSubArrayLen(target2, nums2),
                "Failed for target: 4 and nums: [1, 4, 4]");
    }

    @Test
    public void testMinSubArrayLenWhenSubarrayDoesNotExist() {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 11;
        assertEquals(0, solution.minSubArrayLen(target1, nums1),
                "Failed for target: 11 and nums: [1, 2, 3, 4, 5]");

        int[] nums2 = {5, 6, 7, 8, 9};
        int target2 = 20;
        assertEquals(0, solution.minSubArrayLen(target2, nums2),
                "Failed for target: 20 and nums: [5, 6, 7, 8, 9]");
    }

    @Test
    public void testMinSubArrayLenWithEmptyArray() {
        Solution solution = new Solution();

        int[] nums = {};
        int target = 5;
        assertEquals(0, solution.minSubArrayLen(target, nums),
                "Failed for empty nums array and target: 5");
    }

    @Test
    public void testMinSubArrayLenWithSumEqualToTarget() {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 4, 5};
        int target = 15;
        assertEquals(5, solution.minSubArrayLen(target, nums),
                "Failed for target: 15 and nums: [1, 2, 3, 4, 5]");
    }
}
