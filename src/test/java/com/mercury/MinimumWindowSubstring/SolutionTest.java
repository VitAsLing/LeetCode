package com.mercury.MinimumWindowSubstring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {

    @Test
    public void testMinWindowWhenSubstringExists() {
        Solution solution = new Solution();

        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        assertEquals("BANC", solution.minWindow(s1, t1),
                "Failed for s: 'ADOBECODEBANC' and t: 'ABC'");

        String s2 = "aabbcc";
        String t2 = "abc";
        assertEquals("abbc", solution.minWindow(s2, t2),
                "Failed for s: 'aabbcc' and t: 'abc'");
    }

    @Test
    public void testMinWindowWhenSubstringDoesNotExist() {
        Solution solution = new Solution();

        String s = "ADOBECODEBANC";
        String t = "XYZ";
        assertEquals("", solution.minWindow(s, t),
                "Failed for s: 'ADOBECODEBANC' and t: 'XYZ'");
    }

    @Test
    public void testMinWindowWithEmptyStrings() {
        Solution solution = new Solution();

        String s = "";
        String t = "ABC";
        assertEquals("", solution.minWindow(s, t),
                "Failed for empty s and t");

        String s2 = "ADOBECODEBANC";
        String t2 = "";
        assertEquals("", solution.minWindow(s2, t2),
                "Failed for empty t");
    }
}

