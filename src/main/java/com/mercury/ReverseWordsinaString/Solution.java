package com.mercury.ReverseWordsinaString;

public class Solution {

    public String reverseWords(String s) {
        // 移除多余空格
        StringBuilder sb = removeExtraSpaces(s);

        // 反转整个字符串
        reverseString(sb, 0, sb.length() - 1);

        // 反转每个单词
        reverseEachWord(sb);

        return sb.toString();
    }

    private StringBuilder removeExtraSpaces(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int start = 0;
        // 找到第一个非空格字符的位置
        while (start < n && s.charAt(start) == ' ') {
            start++;
        }

        int end = n - 1;
        // 找到最后一个非空格字符的位置
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        // 从 start 到 end 构建字符串，同时移除多余空格
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) != ' ' || (i > 0 && s.charAt(i - 1) != ' ')) {
                sb.append(s.charAt(i));
            }
        }
        return sb;
    }


    private void reverseString(StringBuilder sb, int left, int right) {
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }

    private void reverseEachWord(StringBuilder sb) {
        int n = sb.length();
        int start = 0;
        for (int end = 0; end < n; end++) {
            if (sb.charAt(end) == ' ') {
                reverseString(sb, start, end - 1);
                start = end + 1;
            }
        }
        // 反转最后一个单词
        reverseString(sb, start, n - 1);
    }

}
