package com.mercury.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (left <= right && top <= bottom) {
            // 从左到右遍历
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // 上边界向下移动一行

            // 从上到下遍历
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // 右边界向左移动一列

            // 从右到左遍历
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // 下边界向上移动一行
            }

            // 从下到上遍历
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // 左边界向右移动一列
            }
        }

        return result;
    }
}

