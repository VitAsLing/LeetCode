package com.mercury.RemoveDuplicatesFromSortedArray;

/**
 * 26. Remove Duplicates from Sorted Array
 * @link <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array/?envType=study-plan-v2&envId=top-interview-150">Remove Duplicates from Sorted Array</a>
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

}
