package com.mercury.SetMatrixZeroes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void testSetZeroes() {
        Solution solution = new Solution();

        int[][] matrix1 = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[][] expected1 = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        solution.setZeroes(matrix1);
        assertTrue(Arrays.deepEquals(expected1, matrix1),
                "Failed for a 3x3 matrix");

        int[][] matrix2 = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        int[][] expected2 = {
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0}
        };
        solution.setZeroes(matrix2);
        assertTrue(Arrays.deepEquals(expected2, matrix2),
                "Failed for a 3x4 matrix");

        int[][] matrix3 = {
                {1}
        };
        int[][] expected3 = {
                {1}
        };
        solution.setZeroes(matrix3);
        assertTrue(Arrays.deepEquals(expected3, matrix3),
                "Failed for a single element matrix");
    }
}
