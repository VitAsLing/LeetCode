package com.mercury.ZigzagConversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testConvert() {
        Solution solution = new Solution();

        // 测试用例 1: 常规情况
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3),
                "Failed for 'PAYPALISHIRING' with 3 rows");

        // 测试用例 2: 更多行
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4),
                "Failed for 'PAYPALISHIRING' with 4 rows");

        // 测试用例 3: 单行
        assertEquals("PAYPALISHIRING", solution.convert("PAYPALISHIRING", 1),
                "Failed for 'PAYPALISHIRING' with 1 row");

        // 测试用例 4: 行数超过字符串长度
        assertEquals("PAYPALISHIRING", solution.convert("PAYPALISHIRING", 20),
                "Failed for 'PAYPALISHIRING' with 20 rows");

        // 测试用例 5: 空字符串
        assertEquals("", solution.convert("", 1),
                "Failed for empty string");
    }
}
