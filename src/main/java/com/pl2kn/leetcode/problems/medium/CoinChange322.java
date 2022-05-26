package com.pl2kn.leetcode.problems.medium;

import javax.swing.border.MatteBorder;

public class CoinChange322 {

  public int coinChange(int[] coins, int amount) {
    if (amount < 1) {
      return 0;
    }

    return coinChange(coins, amount, new int[amount + 1]);
  }

  private int coinChange(int[] coins, int reminder, int[] dp) {
    if (reminder < 0) {
      return -1;
    }

    if (reminder == 0) {
      return 0;
    }

    if (dp[reminder] != 0) {
      return dp[reminder];
    }

    int min = Integer.MAX_VALUE;
    for (int coin : coins) {
      int changeResult = coinChange(coins, reminder - coin, dp);
      if (changeResult >= 0 && changeResult < min) {
        min = 1 + changeResult;
      }
    }

    dp[reminder] = min == Integer.MAX_VALUE ? -1 : min;

    return dp[reminder];
  }
}
