package com.mercury.InsertDeleteGetRandomO1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

public class SolutionTest {

    private Solution.RandomizedSet randomizedSet;

    @BeforeEach
    public void setUp() {
        randomizedSet = new Solution().new RandomizedSet();
    }

    @Test
    public void testInsert() {
        assertTrue(randomizedSet.insert(1), "Failed to insert new value");
        assertFalse(randomizedSet.insert(1), "Inserted duplicate value");
    }

    @Test
    public void testRemove() {
        randomizedSet.insert(1);
        assertTrue(randomizedSet.remove(1), "Failed to remove existing value");
        assertFalse(randomizedSet.remove(1), "Removed non-existing value");
    }

    @Test
    public void testGetRandom() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            randomizedSet.insert(i);
            set.add(i);
        }
        assertTrue(set.contains(randomizedSet.getRandom()), "Random value not in set");
    }

}
