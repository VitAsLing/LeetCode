package com.mercury.BestTimeToBuyAndSellStockII;


/**
 * 122. Best Time to Buy and Sell Stock II
 *
 * @link <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/">Best Time to Buy and Sell Stock II</a>
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int profit =0;
        for (int i = 1; i < prices.length; i++) {
            int tmp = prices[i] - prices[i - 1];
            if (tmp > 0) {
                profit += tmp;
            }
        }
        return profit;
    }
}
