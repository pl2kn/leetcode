package com.pl2kn.leetcode.problems.easy;

public class BestTimeToBuyAndSellStock121 {

  public int maxProfit(int[] prices) {
    int largestDiff = 0;
    int min = Integer.MAX_VALUE;

    for (int price : prices) {
      if (price < min) {
        min = price;
      } else {
        largestDiff = Math.max(largestDiff, price - min);
      }
    }

    return largestDiff;
  }
}
