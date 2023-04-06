package com.pl2kn.leetcode.problems.medium;

public class NumberOfClosedIslands1254 {

  public int closedIsland(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;

    for (int i = 0; i < m; i++) {
      closedIsland(grid, i, 0);
      closedIsland(grid, i, n - 1);
    }

    for (int j = 0; j < n; j++) {
      closedIsland(grid, 0, j);
      closedIsland(grid, m - 1, j);
    }

    int count = 0;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 0) {
          closedIsland(grid, i, j);
          count++;
        }
      }
    }

    return count;
  }

  private void closedIsland(int[][] grid, int i, int j) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 1) {
      return;
    }

    grid[i][j] = 1;

    closedIsland(grid, i - 1, j);
    closedIsland(grid, i + 1, j);
    closedIsland(grid, i, j - 1);
    closedIsland(grid, i, j + 1);
  }
}
