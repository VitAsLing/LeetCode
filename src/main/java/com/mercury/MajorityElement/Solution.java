package com.mercury.MajorityElement;


/**
 * 169. Majority Element
 *
 * @link <a href="https://leetcode.cn/problems/majority-element">Majority Element</a>
 */
public class Solution {

    public int majorityElement(int[] nums) {
        int count = 0;
        int val = 0;

        for (int num : nums) {
            if (count == 0) {
                val = num;
            }

            if (val == num) {
                count++;
            } else {
                count--;
            }
        }

        return val;
    }
}
