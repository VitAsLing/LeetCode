package com.mercury.IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // 检查 s -> t 的映射是否符合
            if (sToT.containsKey(sChar) && sToT.get(sChar) != tChar) {
                return false;
            }

            // 检查 t -> s 的映射是否符合
            if (tToS.containsKey(tChar) && tToS.get(tChar) != sChar) {
                return false;
            }

            // 建立 s -> t 和 t -> s 的映射
            sToT.put(sChar, tChar);
            tToS.put(tChar, sChar);
        }

        return true;
    }
}
