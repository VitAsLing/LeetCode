package com.mercury.RemoveElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    @Test
    public void testRemoveElement(){
        Solution solution = new Solution();
        int[] nums = {3,2,2,3};
        int val = 3;
        int ret = solution.removeElement(nums, val);
        assertEquals(2, ret);
    }

}