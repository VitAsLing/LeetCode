package com.mercury.LongestCommonPrefix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testLongestCommonPrefix() {
        Solution solution = new Solution();

        // 测试用例 1: 有公共前缀的字符串数组
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}),
                "Failed for array with a common prefix");

        // 测试用例 2: 无公共前缀的字符串数组
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}),
                "Failed for array with no common prefix");

        // 测试用例 3: 包含空字符串的数组
        assertEquals("", solution.longestCommonPrefix(new String[]{"", "b", "c"}),
                "Failed for array containing an empty string");

        // 测试用例 4: 只有一个字符串的数组
        assertEquals("abc", solution.longestCommonPrefix(new String[]{"abc"}),
                "Failed for array with a single string");

        // 测试用例 5: 空数组
        assertEquals("", solution.longestCommonPrefix(new String[]{}),
                "Failed for empty array");
    }
}
