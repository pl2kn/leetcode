package com.pl2kn.leetcode.problems.medium;

public class RotateImage48 {

  public void rotate(int[][] matrix) {
    int n = matrix.length;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        swap(matrix, i, j, j, i);
      }
    }

    for (int i = 0; i < n; i++) {
      int left = 0;
      int right = n - 1;
      while (left < right) {
        swap(matrix, i, left++, i, right--);
      }
    }
  }

  private void swap(int[][] matrix, int i, int j, int k, int l) {
    int tmp = matrix[i][j];
    matrix[i][j] = matrix[k][l];
    matrix[k][l] = tmp;
  }
}
