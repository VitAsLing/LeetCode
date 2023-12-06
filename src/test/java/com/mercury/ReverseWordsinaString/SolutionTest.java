package com.mercury.ReverseWordsinaString;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testReverseWords() {
        Solution solution = new Solution();

        // 测试用例 1: 标准情况
        assertEquals("blue is sky the", solution.reverseWords("the sky is blue"),
                "Failed for 'the sky is blue'");

        // 测试用例 2: 前后有空格
        assertEquals("world hello", solution.reverseWords("  hello world  "),
                "Failed for '  hello world  '");

        // 测试用例 3: 单词间有多余空格
        assertEquals("example good a", solution.reverseWords("a  good   example"),
                "Failed for 'a  good   example'");

        // 测试用例 4: 单个单词
        assertEquals("Alice", solution.reverseWords("Alice"),
                "Failed for 'Alice'");

        // 测试用例 5: 空字符串
        assertEquals("", solution.reverseWords(""),
                "Failed for empty string");
    }
}
