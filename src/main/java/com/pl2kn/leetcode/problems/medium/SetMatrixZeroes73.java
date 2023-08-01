package com.pl2kn.leetcode.problems.medium;

public class SetMatrixZeroes73 {

  public void setZeroes(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;

    boolean isZeroCol = false;
    for (int i = 0; i < m; i++) {
      if (matrix[i][0] == 0) {
        isZeroCol = true;
        break;
      }
    }

    boolean isZeroRow = false;
    for (int j = 0; j < n; j++) {
      if (matrix[0][j] == 0) {
        isZeroRow = true;
        break;
      }
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }

    if (isZeroCol) {
      for (int i = 0; i < m; i++) {
        matrix[i][0] = 0;
      }
    }

    if (isZeroRow) {
      for (int j = 0; j < n; j++) {
        matrix[0][j] = 0;
      }
    }
  }
}
