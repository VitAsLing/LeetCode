package com.mercury.InsertDeleteGetRandomO1;

import java.util.*;


/**
 * 380. Insert Delete GetRandom O(1)
 *
 * @link <a href="https://leetcode.cn/problems/insert-delete-getrandom-o1">Insert Delete GetRandom O(1)</a>
 */
public class Solution {

     class RandomizedSet {
        Map<Integer, Integer> dict;
        List<Integer> list;
        Random rand = new Random();

        public RandomizedSet() {
            dict = new HashMap<>();
            list = new ArrayList<>();
        }

        public boolean insert(int val) {
            if (dict.containsKey(val)) {
                return false;
            }
            dict.put(val, list.size());
            list.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!dict.containsKey(val)) {
                return false;
            }
            int lastElement = list.get(list.size() - 1);
            int idx = dict.get(val);
            list.set(idx, lastElement);
            dict.put(lastElement, idx);
            list.remove(list.size() - 1);
            dict.remove(val);
            return true;
        }

        public int getRandom() {
            return list.get(rand.nextInt(list.size()));
        }
    }

}
