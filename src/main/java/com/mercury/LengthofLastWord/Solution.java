package com.mercury.LengthofLastWord;

public class Solution {

    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // 跳过末尾空格
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // 计算最后一个单词的长度
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

}
