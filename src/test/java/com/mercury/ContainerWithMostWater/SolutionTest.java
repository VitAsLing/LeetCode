package com.mercury.ContainerWithMostWater;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testMaxArea() {
        Solution solution = new Solution();

        int[] heights1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, solution.maxArea(heights1),
                "Failed for heights: [1, 8, 6, 2, 5, 4, 8, 3, 7]");

        int[] heights2 = {};
        assertEquals(0, solution.maxArea(heights2),
                "Failed for empty heights array");

        int[] heights3 = {5};
        assertEquals(0, solution.maxArea(heights3),
                "Failed for heights: [5]");

        int[] heights4 = {1, 2, 3, 4, 5};
        assertEquals(6, solution.maxArea(heights4),
                "Failed for heights: [1, 2, 3, 4, 5]");

        int[] heights5 = {5, 4, 3, 2, 1};
        assertEquals(6, solution.maxArea(heights5),
                "Failed for heights: [5, 4, 3, 2, 1]");
    }
}
