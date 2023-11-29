package com.mercury.ProductofArrayExceptSelf;

/**
 * 238. Product of Array Except Self
 *
 * @link <a href="https://leetcode.cn/problems/product-of-array-except-self">Product of Array Except Self</a>
 */
public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProducts = new int[n];

        // 初始化左侧乘积为1
        leftProducts[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        //计算右侧乘积，并求解最终结果
        int rightProduct = 1;
        for (int i = n-1; i >=0 ; i--) {
            leftProducts[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return leftProducts;

    }
}
