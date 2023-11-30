package com.mercury.Candy;

import java.util.Arrays;

/**
 * 135. Candy
 *
 * @link <a href="https://leetcode.cn/problems/candy">Candy</a>
 */
public class Solution {

    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);


        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // 计算总数
        int sum = 0;
        for (int candy : candies) {
            sum += candy;
        }

        return sum;
    }

}
