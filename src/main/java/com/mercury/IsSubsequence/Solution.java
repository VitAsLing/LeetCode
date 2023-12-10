package com.mercury.IsSubsequence;

public class Solution {

    public boolean isSubsequence(String s, String t) {
        int sPointer = 0, tPointer = 0;
        int sLength = s.length(), tLength = t.length();

        while (sPointer < sLength && tPointer < tLength) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }

        return sPointer == sLength;
    }
}
