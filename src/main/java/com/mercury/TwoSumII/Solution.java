package com.mercury.TwoSumII;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // 如果没有找到满足条件的结果，返回空数组或者抛出异常
        return new int[0]; // 或者抛出异常
    }
}
