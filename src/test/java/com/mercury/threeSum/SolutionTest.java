package com.mercury.threeSum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void testThreeSumWhenTripletsExist() {
        Solution solution = new Solution();

        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(expected1, solution.threeSum(nums1),
                "Failed for nums: [-1, 0, 1, 2, -1, -4]");

        int[] nums2 = {0, 0, 0, 0};
        List<List<Integer>> expected2 = Arrays.asList(
                Arrays.asList(0, 0, 0)
        );
        assertEquals(expected2, solution.threeSum(nums2),
                "Failed for nums: [0, 0, 0, 0]");
    }

    @Test
    public void testThreeSumWhenNoTripletsExist() {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 4, 5};
        List<List<Integer>> expected = Arrays.asList();
        assertEquals(expected, solution.threeSum(nums),
                "Failed for nums: [1, 2, 3, 4, 5]");
    }

    @Test
    public void testThreeSumWithEmptyArray() {
        Solution solution = new Solution();

        int[] nums = {};
        List<List<Integer>> expected = Arrays.asList();
        assertEquals(expected, solution.threeSum(nums),
                "Failed for empty nums array");
    }

    @Test
    public void testThreeSumWithAllPositiveNumbers() {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 4, 5};
        List<List<Integer>> expected = Arrays.asList();
        assertEquals(expected, solution.threeSum(nums),
                "Failed for nums: [1, 2, 3, 4, 5]");
    }
}
