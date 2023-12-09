package com.mercury.ValidPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            // 移动左指针，直到它指向一个字母或数字
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // 移动右指针，直到它指向一个字母或数字
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // 比较左右指针所指的字符
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
