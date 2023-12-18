package com.mercury.ValidSudoku;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 创建三个二维数组，分别用于记录数字在行、列和子数独中的出现情况
        boolean[][] rows = new boolean[9][9];
        boolean[][] columns = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // 检查当前数字是否是数字而不是空格
                if (board[i][j] != '.') {
                    int digit = board[i][j] - '1'; // 转换为数字的索引（0-8）
                    int boxIndex = (i / 3) * 3 + j / 3; // 计算当前数字所在子数独的索引

                    // 检查当前数字是否在对应行、列和子数独中已经出现过
                    if (rows[i][digit] || columns[j][digit] || boxes[boxIndex][digit]) {
                        return false; // 如果重复出现，返回false
                    }

                    // 将当前数字在行、列和子数独中标记为已出现
                    rows[i][digit] = true;
                    columns[j][digit] = true;
                    boxes[boxIndex][digit] = true;
                }
            }
        }

        return true; // 数独有效，返回true
    }
}
