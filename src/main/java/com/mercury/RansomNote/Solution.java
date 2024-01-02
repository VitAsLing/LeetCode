package com.mercury.RansomNote;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 用哈希表记录 magazine 中每个字符出现的次数
        Map<Character, Integer> charCount = new HashMap<>();

        // 统计 magazine 中每个字符的出现次数
        for (char c : magazine.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // 遍历 ransomNote，检查每个字符在 magazine 中的出现次数是否足够
        for (char c : ransomNote.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) <= 0) {
                return false; // 在 magazine 中不存在该字符或者出现次数不够，返回 false
            } else {
                charCount.put(c, charCount.get(c) - 1); // 减少字符在 magazine 中的出现次数
            }
        }

        return true;
    }
}
