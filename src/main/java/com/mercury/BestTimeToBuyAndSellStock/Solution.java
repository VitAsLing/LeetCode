package com.mercury.BestTimeToBuyAndSellStock;

/**
 * 121. Best Time to Buy and Sell Stock
 *
 * @link <a href="https://leetcode.cn/problems/best-time-to-buy-and-sell-stock">Best Time to Buy and Sell Stock</a>
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;

        int totalProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > totalProfit) {
                totalProfit = price - minPrice;
            }
        }
        return totalProfit;
    }
}
