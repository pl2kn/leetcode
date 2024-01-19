package com.pl2kn.leetcode.problems.medium;

public class MinimumFallingPathSum931 {

  public int minFallingPathSum(int[][] matrix) {
    int n = matrix.length;

    int[][] dp = new int[n][n];
    for (int i = 0; i < n; i++) {
      dp[0][i] = matrix[0][i];
    }

    for (int i = 1; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int minPreviousPath = Integer.MAX_VALUE;

        for (int k = - 1; k <= 1; k++) {
          int previousPath;

          if (j + k < 0 || j + k >= n) {
            previousPath = Integer.MAX_VALUE;
          } else {
            previousPath = dp[i - 1][j + k];
          }

          minPreviousPath = Math.min(minPreviousPath, previousPath);
        }

        dp[i][j] = matrix[i][j] + minPreviousPath;
      }
    }

    int minFallingPath = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      minFallingPath = Math.min(minFallingPath, dp[n - 1][i]);
    }

    return minFallingPath;
  }
}
