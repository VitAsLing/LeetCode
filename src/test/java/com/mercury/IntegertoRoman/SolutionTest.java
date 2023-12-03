package com.mercury.IntegertoRoman;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testIntToRoman() {
        Solution solution = new Solution();

        // 测试用例 1: 基本的罗马数字
        assertEquals("III", solution.intToRoman(3),
                "Failed for integer 3");

        // 测试用例 2: 包含减法规则的罗马数字
        assertEquals("IV", solution.intToRoman(4),
                "Failed for integer 4");

        // 测试用例 3: 复杂的罗马数字
        assertEquals("LVIII", solution.intToRoman(58),
                "Failed for integer 58");

        // 测试用例 4: 更复杂的罗马数字
        assertEquals("MCMXCIV", solution.intToRoman(1994),
                "Failed for integer 1994");
    }
}
