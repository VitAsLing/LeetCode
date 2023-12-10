package com.mercury.IsSubsequence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testIsSubsequence() {
        Solution solution = new Solution();

        // 测试用例 1: s 是 t 的子序列
        assertTrue(solution.isSubsequence("abc", "ahbgdc"),
                "Failed when s is a subsequence of t");

        // 测试用例 2: s 不是 t 的子序列
        assertFalse(solution.isSubsequence("axc", "ahbgdc"),
                "Failed when s is not a subsequence of t");

        // 测试用例 3: 空字符串情况
        assertTrue(solution.isSubsequence("", ""),
                "Failed when both strings are empty");

        // 测试用例 4: s 是单个字符且在 t 中
        assertTrue(solution.isSubsequence("a", "abc"),
                "Failed when s is a single character in t");

        // 测试用例 5: s 是单个字符但不在 t 中
        assertFalse(solution.isSubsequence("z", "abc"),
                "Failed when s is a single character not in t");
    }
}
