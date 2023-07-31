package com.pl2kn.leetcode.problems.medium;

public class MinimumASCIIDeleteSumForTwoStrings712 {

  public int minimumDeleteSum(String s1, String s2) {
    return minimumDeleteSum(s1, 0, s2, 0, new Integer[s1.length() + 1][s2.length() + 1]);
  }

  private int minimumDeleteSum(String s1, int i, String s2, int j, Integer[][] memo) {
    if (i == s1.length() && j == s2.length()) {
      return 0;
    }

    if (memo[i][j] != null) {
      return memo[i][j];
    }

    if (i < s1.length() && j < s2.length() && s1.charAt(i) == s2.charAt(j)) {
      return memo[i][j] = minimumDeleteSum(s1, i + 1, s2, j + 1, memo);
    }

    return memo[i][j] = Math.min(
        i < s1.length() ? (int)s1.charAt(i) + minimumDeleteSum(s1, i + 1, s2, j, memo) : Integer.MAX_VALUE,
        j < s2.length() ? (int)s2.charAt(j) + minimumDeleteSum(s1, i, s2, j + 1, memo) : Integer.MAX_VALUE
    );
  }
}
