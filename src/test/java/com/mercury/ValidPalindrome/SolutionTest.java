package com.mercury.ValidPalindrome;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testIsPalindrome() {
        Solution solution = new Solution();

        // 测试用例 1: 标准回文
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"),
                "Failed for 'A man, a plan, a canal: Panama'");

        // 测试用例 2: 非回文
        assertFalse(solution.isPalindrome("race a car"),
                "Failed for 'race a car'");

        // 测试用例 3: 空字符串
        assertTrue(solution.isPalindrome(""),
                "Failed for empty string");

        // 测试用例 4: 只有一个字符
        assertTrue(solution.isPalindrome("a"),
                "Failed for 'a'");

        // 测试用例 5: 包含特殊字符
        assertTrue(solution.isPalindrome(".,"),
                "Failed for '.,'");
    }
}
