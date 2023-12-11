package com.mercury.TwoSumII;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testTwoSum() {
        Solution solution = new Solution();

        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {1, 2};
        assertArrayEquals(expected1, solution.twoSum(numbers1, target1),
                "Failed for numbers: [2, 7, 11, 15] and target: 9");

        int[] numbers2 = {2, 7, 11, 15};
        int target2 = 10;
        int[] expected2 = {};
        assertArrayEquals(expected2, solution.twoSum(numbers2, target2),
                "Failed for numbers: [2, 7, 11, 15] and target: 10");

        int[] numbers3 = {};
        int target3 = 5;
        int[] expected3 = {};
        assertArrayEquals(expected3, solution.twoSum(numbers3, target3),
                "Failed for empty numbers array and target: 5");

        int[] numbers4 = {5};
        int target4 = 5;
        int[] expected4 = {};
        assertArrayEquals(expected4, solution.twoSum(numbers4, target4),
                "Failed for numbers: [5] and target: 5");

        int[] numbers5 = {2, 3};
        int target5 = 8;
        int[] expected5 = {};
        assertArrayEquals(expected5, solution.twoSum(numbers5, target5),
                "Failed for numbers: [2, 3] and target: 8");

        int[] numbers6 = {2, 3};
        int target6 = 5;
        int[] expected6 = {1, 2};
        assertArrayEquals(expected6, solution.twoSum(numbers6, target6),
                "Failed for numbers: [2, 3] and target: 5");
    }
}
