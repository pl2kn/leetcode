package com.pl2kn.leetcode.problems.medium;

public class InterleavingString97 {

  public boolean isInterleave(String s1, String s2, String s3) {
    if (s1.length() + s2.length() != s3.length()) {
      return false;
    }

    int[][] memo = new int[s1.length()][s2.length()];
    for (int i = 0; i < s1.length(); i++) {
      for (int j = 0; j < s2.length(); j++) {
        memo[i][j] = -1;
      }
    }

    return isInterleave(s1, 0, s2, 0, s3, 0, memo);
  }

  private boolean isInterleave(String s1, int i, String s2, int j, String s3, int k, int[][] memo) {
    if (i == s1.length()) {
      return s2.substring(j).equals(s3.substring(k));
    }

    if (j == s2.length()) {
      return s1.substring(i).equals(s3.substring(k));
    }

    if (memo[i][j] != -1) {
      return memo[i][j] == 1;
    }

    boolean result = (s1.charAt(i) == s3.charAt(k) && isInterleave(s1, i + 1, s2, j, s3, k + 1, memo))
        || s2.charAt(j) == s3.charAt(k) && isInterleave(s1, i, s2, j + 1, s3, k + 1, memo);

    memo[i][j] = result ? 1 : 0;

    return result;
  }
}
