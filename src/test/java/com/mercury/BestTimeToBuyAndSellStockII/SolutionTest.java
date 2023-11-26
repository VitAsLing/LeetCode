package com.mercury.BestTimeToBuyAndSellStockII;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testMaxProfit() {
        Solution solution = new Solution();

        // 测试用例 1: 价格波动，多次买卖
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int expectedProfit1 = 7; // 买入价 1，卖出价 5；再买入价 3，卖出价 6
        assertEquals(expectedProfit1, solution.maxProfit(prices1),
                "Failed for fluctuating prices with multiple transactions");

        // 测试用例 2: 价格持续上升
        int[] prices2 = {1, 2, 3, 4, 5};
        int expectedProfit2 = 4; // 每天买卖，总利润 4
        assertEquals(expectedProfit2, solution.maxProfit(prices2),
                "Failed for continually rising prices");

        // 测试用例 3: 价格持续下降
        int[] prices3 = {5, 4, 3, 2, 1};
        int expectedProfit3 = 0; // 没有利润
        assertEquals(expectedProfit3, solution.maxProfit(prices3),
                "Failed for continually declining prices");

        // 测试用例 4: 只有一个价格
        int[] prices4 = {5};
        int expectedProfit4 = 0; // 没有利润
        assertEquals(expectedProfit4, solution.maxProfit(prices4),
                "Failed for single price");

        // 您可以根据需要添加更多测试用例以覆盖其他情况
    }
}