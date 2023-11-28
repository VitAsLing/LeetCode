package com.mercury.HIndex;


/**
 * 274. H-Index
 *
 * @link <a href="https://leetcode.cn/problems/h-index/">H-Index</a>
 */
public class Solution {

    public int hIndex(int[] citations) {
        int left = 0;
        int right = citations.length;
        int mid = 0;
        int cnt = 0;

        while (left < right) {
            // +1 防止死循环
            mid = (left + right + 1) / 2;
            cnt = 0;
            for (int citation : citations) {
                if (citation >= mid) {
                    cnt++;
                }
            }
            if (cnt >= mid) {
                // 要找的答案在 [mid,right] 区间内
                left = mid;
            } else {
                // 要找的答案在 [0,mid) 区间内
                right = mid - 1;
            }
        }
        return left;
    }
}
