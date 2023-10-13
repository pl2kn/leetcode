package com.pl2kn.leetcode.problems.medium;

public class BestTimeToBuyAndSellStockII122 {

  public int maxProfit(int[] prices) {
    int n = prices.length - 1;
    int profit = 0;
    int buy = 0;
    int sell = 0;
    int i = 0;
    while (i < n) {
      while (i < n && prices[i] >= prices[i + 1]) {
        i++;
      }
      buy = prices[i];

      while (i < n && prices[i] <= prices[i + 1]) {
        i++;
      }
      sell = prices[i];

      profit += sell - buy;
    }

    return profit;
  }
}
