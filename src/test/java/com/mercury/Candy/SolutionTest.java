package com.mercury.Candy;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testCandy() {
        Solution solution = new Solution();

        // 测试用例 1: 递增的评分
        int[] ratings1 = {1, 2, 3, 4, 5};
        int expectedCandy1 = 15; // 1 + 2 + 3 + 4 + 5 = 15
        assertEquals(expectedCandy1, solution.candy(ratings1),
                "Failed for increasing ratings");

        // 测试用例 2: 递减的评分
        int[] ratings2 = {5, 4, 3, 2, 1};
        int expectedCandy2 = 15; // 同样是 1 + 2 + 3 + 4 + 5 = 15
        assertEquals(expectedCandy2, solution.candy(ratings2),
                "Failed for decreasing ratings");

        // 测试用例 3: 波动的评分
        int[] ratings3 = {1, 3, 4, 5, 2};
        int expectedCandy3 = 11; // 1 + 2 + 3 + 4 + 1 = 11
        assertEquals(expectedCandy3, solution.candy(ratings3),
                "Failed for fluctuating ratings");
    }
}
