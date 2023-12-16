package com.mercury.SubstringwithConcatenationofAllWords;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void testFindSubstringWhenSubstringsExist() {
        Solution solution = new Solution();

        String s1 = "barfoothefoobarman";
        String[] words1 = {"foo", "bar"};
        List<Integer> expected1 = Arrays.asList(0, 9);
        assertEquals(expected1, solution.findSubstring(s1, words1),
                "Failed for s: 'barfoothefoobarman' and words: ['foo', 'bar']");

        String s2 = "wordgoodgoodgoodbestword";
        String[] words2 = {"word", "good", "best", "word"};
        List<Integer> expected2 = Arrays.asList();
        assertEquals(expected2, solution.findSubstring(s2, words2),
                "Failed for s: 'wordgoodgoodgoodbestword' and words: ['word', 'good', 'best', 'word']");
    }

    @Test
    public void testFindSubstringWhenSubstringsDoNotExist() {
        Solution solution = new Solution();

        String s = "barfoothefoobarman";
        String[] words = {"hello", "world"};
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solution.findSubstring(s, words),
                "Failed for s: 'barfoothefoobarman' and words: ['hello', 'world']");
    }

    @Test
    public void testFindSubstringWithEmptyStringOrWords() {
        Solution solution = new Solution();

        String s = "";
        String[] words = {"foo", "bar"};
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, solution.findSubstring(s, words),
                "Failed for empty string");

        String s2 = "barfoothefoobarman";
        String[] words2 = {};
        List<Integer> expected2 = new ArrayList<>();
        assertEquals(expected2, solution.findSubstring(s2, words2),
                "Failed for empty words array");
    }
}
