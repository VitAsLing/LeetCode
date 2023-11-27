package com.mercury.JumpGame;

/**
 * 55. Jump Game
 *
 * @link <a href="https://leetcode.cn/problems/jump-game">Jump Game</a>
 */
public class Solution {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0;
        for (int i = 0; i < n; i++) {
            if (i <= maxReach){
                maxReach = Math.max(maxReach,i+nums[i]);
                if (maxReach >= n - 1){
                    return true;
                }
            }
        }
        return false;
    }
}
