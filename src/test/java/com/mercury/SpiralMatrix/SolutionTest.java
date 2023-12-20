package com.mercury.SpiralMatrix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void testSpiralOrder() {
        Solution solution = new Solution();

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expected1 = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertEquals(expected1, solution.spiralOrder(matrix1),
                "Failed for a 3x3 matrix");

        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        List<Integer> expected2 = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        assertEquals(expected2, solution.spiralOrder(matrix2),
                "Failed for a 3x4 matrix");

        int[][] matrix3 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        List<Integer> expected3 = Arrays.asList(1, 2, 3, 6, 5, 4);
        assertEquals(expected3, solution.spiralOrder(matrix3),
                "Failed for a 2x3 matrix");

        int[][] emptyMatrix = {};
        List<Integer> expectedEmpty = Arrays.asList();
        assertEquals(expectedEmpty, solution.spiralOrder(emptyMatrix),
                "Failed for an empty matrix");

        int[][] singleElementMatrix = {{1}};
        List<Integer> expectedSingle = Arrays.asList(1);
        assertEquals(expectedSingle, solution.spiralOrder(singleElementMatrix),
                "Failed for a single element matrix");
    }
}
