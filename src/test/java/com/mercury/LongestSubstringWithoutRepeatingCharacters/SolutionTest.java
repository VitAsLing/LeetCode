package com.mercury.LongestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testLengthOfLongestSubstringWhenExists() {
        Solution solution = new Solution();

        String s1 = "abcabcbb";
        assertEquals(3, solution.lengthOfLongestSubstring(s1),
                "Failed for string: 'abcabcbb'");

        String s2 = "pwwkew";
        assertEquals(3, solution.lengthOfLongestSubstring(s2),
                "Failed for string: 'pwwkew'");
    }

    @Test
    public void testLengthOfLongestSubstringWhenNotExists() {
        Solution solution = new Solution();

        String s = "bbbbbb";
        assertEquals(1, solution.lengthOfLongestSubstring(s),
                "Failed for string: 'bbbbbb'");
    }

    @Test
    public void testLengthOfLongestSubstringWithEmptyString() {
        Solution solution = new Solution();

        String s = "";
        assertEquals(0, solution.lengthOfLongestSubstring(s),
                "Failed for empty string");
    }

    @Test
    public void testLengthOfLongestSubstringWithNoRepeatingCharacters() {
        Solution solution = new Solution();

        String s = "abcdefg";
        assertEquals(7, solution.lengthOfLongestSubstring(s),
                "Failed for string: 'abcdefg'");
    }
}
