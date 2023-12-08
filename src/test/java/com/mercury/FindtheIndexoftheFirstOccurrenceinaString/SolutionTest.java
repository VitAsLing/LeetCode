package com.mercury.FindtheIndexoftheFirstOccurrenceinaString;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testStrStr() {
        Solution solution = new Solution();

        // 测试用例 1: 普通情况
        assertEquals(2, solution.strStr("hello", "ll"),
                "Failed for 'hello' containing 'll'");

        // 测试用例 2: 不存在的子字符串
        assertEquals(-1, solution.strStr("aaaaa", "bba"),
                "Failed for 'aaaaa' not containing 'bba'");

        // 测试用例 3: 空的子字符串
        assertEquals(0, solution.strStr("hello", ""),
                "Failed for 'hello' with empty needle");

        // 测试用例 4: 空的 haystack
        assertEquals(-1, solution.strStr("", "ll"),
                "Failed for empty haystack containing 'll'");

        // 测试用例 5: haystack 和 needle 相等
        assertEquals(0, solution.strStr("a", "a"),
                "Failed for 'a' containing 'a'");
    }
}
