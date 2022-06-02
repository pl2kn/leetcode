package com.pl2kn.leetcode.problems.hard;

public class BestTimeToBuyAndSellStockIV188 {

  private int[] prices;
  private int[][][] memo;

  public int maxProfit(int k, int[] prices) {
    this.prices = prices;
    this.memo = new int[prices.length][k + 1][2];

    return dp(0, k, 0);
  }

  public int dp(int i, int transactionRemaining, int holding) {
    if (transactionRemaining == 0 || i == prices.length) {
      return 0;
    }

    if (memo[i][transactionRemaining][holding] == 0) {
      int doNothing = dp(i + 1, transactionRemaining, holding);

      int doSomething;
      if (holding == 1) {
        doSomething = prices[i] + dp(i + 1, transactionRemaining - 1, 0);
      } else {
        doSomething = -prices[i] + dp(i + 1, transactionRemaining, 1);
      }

      memo[i][transactionRemaining][holding] = Math.max(doNothing, doSomething);
    }

    return memo[i][transactionRemaining][holding];
  }
}
