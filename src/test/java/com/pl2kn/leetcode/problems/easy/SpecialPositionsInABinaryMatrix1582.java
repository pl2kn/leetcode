package com.pl2kn.leetcode.problems.easy;

public class SpecialPositionsInABinaryMatrix1582 {

  public int numSpecial(int[][] mat) {
    int m = mat.length;
    int n = mat[0].length;

    int[] rowOneCounts = new int[m];
    int[] colOneCounts = new int[n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (mat[i][j] == 1) {
          rowOneCounts[i]++;
          colOneCounts[j]++;
        }
      }
    }

    int result = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (mat[i][j] == 1 && rowOneCounts[i] == 1 && colOneCounts[j] == 1) {
          result++;
        }
      }
    }

    return result;
  }
}
