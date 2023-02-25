package com.pl2kn.leetcode.problems.medium;

public class RotateImage48 {

  public void rotate(int[][] matrix) {
    int n = matrix.length;
    int top = 0;
    int down = n - 1;

    while (top < down) {
      int[] tmp = matrix[top];
      matrix[top++] = matrix[down];
      matrix[down--] = tmp;
    }

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = tmp;
      }
    }
  }
}
