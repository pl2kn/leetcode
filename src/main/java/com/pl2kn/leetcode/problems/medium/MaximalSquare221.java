package com.pl2kn.leetcode.problems.medium;

import java.util.Map;

public class MaximalSquare221 {

  public int maximalSquare(char[][] matrix) {
    if (matrix == null || matrix.length == 0) {
      return 0;
    }

    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] dp = new int[rows + 1][cols + 1];
    int result = 0;

    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= cols; j++) {
        if (matrix[i - 1][j - 1] == '1') {
          dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
          result = Math.max(result, dp[i][j]);
        }
      }
    }

    return result * result;
  }
}
