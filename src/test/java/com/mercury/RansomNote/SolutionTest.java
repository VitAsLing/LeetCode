package com.mercury.RansomNote;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testCanConstruct() {
        Solution solution = new Solution();

        // magazine 中包含足够的字符以构建赎金信
        assertTrue(solution.canConstruct("a", "ab"),
                "Failed for 'a' from 'ab'");

        assertTrue(solution.canConstruct("aa", "aab"),
                "Failed for 'aa' from 'aab'");

        assertTrue(solution.canConstruct("abcd", "abcdabcd"),
                "Failed for 'abcd' from 'abcdabcd'");

        // magazine 中不包含足够的字符以构建赎金信
        assertFalse(solution.canConstruct("a", "b"),
                "Failed for 'a' from 'b'");

        assertFalse(solution.canConstruct("aa", "bb"),
                "Failed for 'aa' from 'bb'");

        assertFalse(solution.canConstruct("abcd", "efgh"),
                "Failed for 'abcd' from 'efgh'");
    }
}
