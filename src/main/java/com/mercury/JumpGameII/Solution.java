package com.mercury.JumpGameII;


/**
 * 45. Jump Game II
 *
 * @link <a href="https://leetcode.cn/problems/jump-game-ii">Jump Game II</a>
 */
public class Solution {

    public int jump(int[] nums) {
        int position = nums.length-1;
        int steps = 0;
        while (position > 0 ){
            for (int i = 0; i < position; i++) {
                if (i+nums[i] >= position){
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }
}
