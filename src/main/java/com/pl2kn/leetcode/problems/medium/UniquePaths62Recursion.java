package com.pl2kn.leetcode.problems.medium;

public class UniquePaths62Recursion {

  public int uniquePaths(int m, int n) {
    return uniquePathsHelper(m - 1, n - 1);
  }

  private int uniquePathsHelper(int m, int n) {
    if (m < 0 || n < 0) {
      return 0;
    }

    if (m == 0 || n == 0) {
      return 1;
    }

    return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
  }
}
