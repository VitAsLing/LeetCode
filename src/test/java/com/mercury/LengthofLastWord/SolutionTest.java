package com.mercury.LengthofLastWord;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testLengthOfLastWord() {
        Solution solution = new Solution();

        // 测试用例 1: 标准情况
        assertEquals(5, solution.lengthOfLastWord("Hello World"),
                "Failed for string 'Hello World'");

        // 测试用例 2: 末尾有多余空格
        assertEquals(5, solution.lengthOfLastWord("Hello World  "),
                "Failed for string 'Hello World  '");

        // 测试用例 3: 只有一个单词
        assertEquals(4, solution.lengthOfLastWord("java"),
                "Failed for string 'java'");

        // 测试用例 4: 空字符串
        assertEquals(0, solution.lengthOfLastWord(""),
                "Failed for empty string");

        // 测试用例 5: 全为空格的字符串
        assertEquals(0, solution.lengthOfLastWord("   "),
                "Failed for string with only spaces");
    }
}
