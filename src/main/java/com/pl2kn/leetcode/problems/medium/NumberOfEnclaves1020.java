package com.pl2kn.leetcode.problems.medium;

public class NumberOfEnclaves1020 {

  public int numEnclaves(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;

    for (int i = 0; i < m; i++) {
      numEnclaves(grid, i, 0);
      numEnclaves(grid, i, n - 1);
    }

    for (int j = 0; j < n; j++) {
      numEnclaves(grid, 0, j);
      numEnclaves(grid, m - 1, j);
    }

    int count = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 1) {
          count++;
        }
      }
    }

    return count;
  }

  private void numEnclaves(int[][] grid, int i, int j) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
      return;
    }

    grid[i][j] = 0;

    numEnclaves(grid, i - 1, j);
    numEnclaves(grid, i + 1, j);
    numEnclaves(grid, i, j - 1);
    numEnclaves(grid, i, j + 1);
  }
}
