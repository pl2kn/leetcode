package com.pl2kn.leetcode.problems.easy;

public class MatrixDiagonalSum1572 {
  public int diagonalSum(int[][] mat) {
    int n = mat.length;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += mat[i][i] + mat[i][n - 1 - i];
      if (i == n - 1 - i) {
        sum -= mat[i][i];
      }
    }
    return sum;
  }
}
