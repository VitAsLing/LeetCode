package com.mercury.RotateArray;

/**
 * 189. Rotate Array
 *
 * @link <a href="https://leetcode.cn/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150">Rotate Array</a>
 */
public class Solution {

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0){
            return;
        }
        // k %= nums.length 这行代码的作用是为了处理当旋转次数 k 大于数组长度的情况。
        // 这里的 %= 是取模赋值运算符，它将 k 更新为 k 除以 nums.length 的余数
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
