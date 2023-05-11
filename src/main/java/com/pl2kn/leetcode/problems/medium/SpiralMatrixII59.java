package com.pl2kn.leetcode.problems.medium;

public class SpiralMatrixII59 {

  public int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    int top = 0;
    int left = 0;
    int right = n - 1;
    int bottom = n - 1;
    int k = 1;
    while (k <= n * n) {
      for (int j = left; j <= right; j++) {
        matrix[top][j] = k++;
      }

      for (int i = top + 1; i <= bottom; i++) {
        matrix[i][right] = k++;
      }

      for (int j = right - 1; j >= left; j--) {
        matrix[bottom][j] = k++;
      }

      for (int i = bottom - 1; i >= top + 1; i--) {
        matrix[i][left] = k++;
      }

      top++;
      left++;
      right--;
      bottom--;
    }

    return matrix;
  }
}
