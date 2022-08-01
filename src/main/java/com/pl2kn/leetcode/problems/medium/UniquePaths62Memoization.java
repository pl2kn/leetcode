package com.pl2kn.leetcode.problems.medium;

public class UniquePaths62Memoization {

  private int[][] memo;

  public int uniquePaths(int m, int n) {
    memo = new int[m][n];

    return uniquePathsHelper(m - 1, n - 1);
  }

  private int uniquePathsHelper(int m, int n) {
    if (m < 0 || n < 0) {
      return 0;
    }

    if (m == 0 || n == 0) {
      return 1;
    }

    if (memo[m][n] > 0) {
      return memo[m][n];
    }

    memo[m][n] = uniquePathsHelper(m - 1, n) + uniquePathsHelper(m, n - 1);

    return memo[m][n];
  }
}
