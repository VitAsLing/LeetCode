package com.mercury.IsomorphicStrings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testIsIsomorphic() {
        Solution solution = new Solution();

        // 两个空字符串
        assertTrue(solution.isIsomorphic("", ""),
                "Failed for empty strings");

        // 字符串长度不同
        assertFalse(solution.isIsomorphic("foo", "bar"),
                "Failed for 'foo' and 'bar'");

        // 同构的情况
        assertTrue(solution.isIsomorphic("egg", "add"),
                "Failed for 'egg' and 'add'");

        assertTrue(solution.isIsomorphic("paper", "title"),
                "Failed for 'paper' and 'title'");

        assertTrue(solution.isIsomorphic("ab", "ca"),
                "Failed for 'ab' and 'ca'");

        // 不同构的情况
        assertFalse(solution.isIsomorphic("foo", "bar"),
                "Failed for 'foo' and 'bar'");

        assertFalse(solution.isIsomorphic("ab", "aa"),
                "Failed for 'ab' and 'aa'");
    }
}
