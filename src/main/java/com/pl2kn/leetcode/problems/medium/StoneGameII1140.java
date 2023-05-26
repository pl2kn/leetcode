package com.pl2kn.leetcode.problems.medium;

public class StoneGameII1140 {

  public int stoneGameII(int[] piles) {
    int[][][] dp = new int[2][piles.length + 1][piles.length + 1];
    for (int p = 0; p < 2; p++) {
      for (int i = 0; i <= piles.length; i++) {
        for (int m = 0; m <= piles.length; m++) {
          dp[p][i][m] = -1;
        }
      }
    }
    return stoneGameII(piles, 0, 0, 1, dp);
  }

  private int stoneGameII(int[] piles, int p, int i, int m, int[][][] dp) {
    if (i == piles.length) {
      return 0;
    }

    if (dp[p][i][m] != -1) {
      return dp[p][i][m];
    }

    int result = p == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    int sum = 0;
    for (int x = 1; x <= Math.min(2 * m, piles.length - i); x++) {
      sum += piles[i + x - 1];

      if (p == 0) {
        result = Math.max(result, sum + stoneGameII(piles, 1, i + x, Math.max(m, x), dp));
      } else {
        result = Math.min(result, stoneGameII(piles, 0, i + x, Math.max(m, x), dp));
      }
    }

    return dp[p][i][m] = result;
  }
}
