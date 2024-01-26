package com.pl2kn.leetcode.problems.medium;

public class OutOfBoundaryPaths576 {

  private final static int[][] DIRECTIONS = new int[][]{{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
  private final static int MOD = 1000000007;

  public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
    return findPaths(new int[m][n], startRow, startColumn, maxMove, new Integer[m][n][maxMove + 1]);
  }

  private int findPaths(int[][] grid, int i, int j, int moves, Integer[][][] memo) {
    if (!checkBounds(grid, i, j)) {
      return 1;
    }

    if (moves == 0) {
      return 0;
    }

    if (memo[i][j][moves] != null) {
      return memo[i][j][moves];
    }

    int result = 0;
    for (int[] direction : DIRECTIONS) {
      result = (result + findPaths(grid, i + direction[0], j + direction[1], moves - 1, memo) % MOD) % MOD;
    }

    return memo[i][j][moves] = result;
  }

  private boolean checkBounds(int[][] grid, int i, int j) {
    return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length;
  }
}
