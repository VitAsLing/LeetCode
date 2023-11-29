package com.mercury.GasStation;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testCanCompleteCircuit() {
        Solution solution = new Solution();

        // 测试用例 1: 可以完成一圈
        int[] gas1 = {1, 2, 3, 4, 5};
        int[] cost1 = {3, 4, 5, 1, 2};
        int expectedStation1 = 3;
        assertEquals(expectedStation1, solution.canCompleteCircuit(gas1, cost1),
                "Failed for case where circuit can be completed");

        // 测试用例 2: 无法完成一圈
        int[] gas2 = {2, 3, 4};
        int[] cost2 = {3, 4, 3};
        int expectedStation2 = -1;
        assertEquals(expectedStation2, solution.canCompleteCircuit(gas2, cost2),
                "Failed for case where circuit cannot be completed");

        // 测试用例 3: 加油站和油耗相同
        int[] gas3 = {1, 1, 1, 1};
        int[] cost3 = {1, 1, 1, 1};
        int expectedStation3 = 0; // 可以从任何加油站开始
        assertEquals(expectedStation3, solution.canCompleteCircuit(gas3, cost3),
                "Failed for case with equal gas and cost");
    }
}
