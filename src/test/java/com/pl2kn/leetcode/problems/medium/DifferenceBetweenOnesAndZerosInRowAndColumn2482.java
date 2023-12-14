package com.pl2kn.leetcode.problems.medium;

public class DifferenceBetweenOnesAndZerosInRowAndColumn2482 {

  public int[][] onesMinusZeros(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;

    int[] onesRows = new int[m];
    int[] onesCols = new int[n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 1) {
          onesRows[i]++;
          onesCols[j]++;
        }
      }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        grid[i][j] = onesRows[i] + onesCols[j] - (m - onesRows[i]) - (n - onesCols[j]);
      }
    }

    return grid;
  }
}
