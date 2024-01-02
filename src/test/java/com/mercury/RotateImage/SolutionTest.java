package com.mercury.RotateImage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void testRotateImage() {
        Solution solution = new Solution();

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected1 = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
        solution.rotate(matrix1);
        assertTrue(Arrays.deepEquals(expected1, matrix1),
                "Failed for a 3x3 matrix");

        int[][] matrix2 = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        int[][] expected2 = {
                {15, 13, 2, 5},
                {14, 3, 4, 1},
                {12, 6, 8, 9},
                {16, 7, 10, 11}
        };
        solution.rotate(matrix2);
        assertTrue(Arrays.deepEquals(expected2, matrix2),
                "Failed for a 4x4 matrix");

        int[][] matrix3 = {
                {1}
        };
        int[][] expected3 = {
                {1}
        };
        solution.rotate(matrix3);
        assertTrue(Arrays.deepEquals(expected3, matrix3),
                "Failed for a single element matrix");
    }
}
