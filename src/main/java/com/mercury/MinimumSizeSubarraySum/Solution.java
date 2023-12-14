package com.mercury.MinimumSizeSubarraySum;

public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left++];
            }
        }

        // 如果 minLength 仍然是 Integer.MAX_VALUE，表示没有找到满足条件的子数组
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }


}
