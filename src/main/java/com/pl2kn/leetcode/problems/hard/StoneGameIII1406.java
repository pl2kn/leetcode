package com.pl2kn.leetcode.problems.hard;

public class StoneGameIII1406 {

  public String stoneGameIII(int[] stoneValue) {
    int diff = stoneGameIII(stoneValue, stoneValue.length, 0, new Integer[stoneValue.length + 1]);

    if (diff > 0) {
      return "Alice";
    }

    if (diff < 0) {
      return "Bob";
    }

    return "Tie";
  }

  private int stoneGameIII(int[] stoneValue, int n, int i, Integer[] dp) {
    if (i == n) {
      return 0;
    }

    if (dp[i] != null) {
      return dp[i];
    }

    dp[i] = stoneValue[i] - stoneGameIII(stoneValue, n, i + 1, dp);
    if (i + 2 <= n) {
      dp[i] = Math.max(dp[i], stoneValue[i] + stoneValue[i + 1] - stoneGameIII(stoneValue, n, i + 2, dp));
    }

    if (i + 3 <= n) {
      dp[i] = Math.max(dp[i], stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2] - stoneGameIII(stoneValue, n, i + 3, dp));
    }

    return dp[i];
  }
}
