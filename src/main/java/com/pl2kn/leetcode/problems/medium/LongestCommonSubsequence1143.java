package com.pl2kn.leetcode.problems.medium;

public class LongestCommonSubsequence1143 {

  private int[][] memo;
  private String text1;
  private String text2;

  public int longestCommonSubsequence(String text1, String text2) {
    memo = new int[text1.length() + 1][text2.length() + 1];

    for (int i = 0; i < text1.length(); i++) {
      for (int j = 0; j < text2.length(); j++) {
        memo[i][j] = -1;
      }
    }

    this.text1 = text1;
    this.text2 = text2;

    return dp(0, 0);
  }

  private int dp(int i, int j) {
    if (memo[i][j] != -1) {
      return memo[i][j];
    }

    int result;
    if (text1.charAt(i) == text2.charAt(j)) {
      result = 1 + dp(i + 1, j + 1);
    } else {
      result = Math.max(dp(i, j + 1), dp(i + 1, j));
    }

    memo[i][j] = result;

    return memo[i][j];
  }
}
