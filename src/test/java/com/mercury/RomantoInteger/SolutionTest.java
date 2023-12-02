package com.mercury.RomantoInteger;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testRomanToInt() {
        Solution solution = new Solution();

        // 测试用例 1: 标准罗马数字
        assertEquals(3, solution.romanToInt("III"),
                "Failed for Roman numeral III");

        // 测试用例 2: 包含减法规则的罗马数字
        assertEquals(4, solution.romanToInt("IV"),
                "Failed for Roman numeral IV");

        // 测试用例 3: 复杂的罗马数字
        assertEquals(58, solution.romanToInt("LVIII"),
                "Failed for Roman numeral LVIII");

        // 测试用例 4: 更复杂的罗马数字
        assertEquals(1994, solution.romanToInt("MCMXCIV"),
                "Failed for Roman numeral MCMXCIV");
    }
}
