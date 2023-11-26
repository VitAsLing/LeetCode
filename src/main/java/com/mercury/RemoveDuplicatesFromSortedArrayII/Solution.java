package com.mercury.RemoveDuplicatesFromSortedArrayII;

/**
 * 80. Remove Duplicates from Sorted Array II
 * @link <a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii">Remove Duplicates from Sorted Array II</a>
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        if(nums == null){
            return 0;
        }
        if(nums.length <= 2){
            return nums.length;
        }
        int fast = 2;
        int slow = 2;
        while(fast < nums.length){
            if(nums[slow-2]  != nums[fast]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
