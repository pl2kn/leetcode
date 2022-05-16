package com.pl2kn.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class MinCostClimbingStairs746TopDown {

  private int[] cost;
  private final Map<Integer, Integer> memo = new HashMap<>();

  public int minCostClimbingStairs(int[] cost) {
    this.cost = cost;

    return dp(cost.length);
  }

  private int dp(int i) {
    if (i < 2) {
      return 0;
    }

    if (!memo.containsKey(i)) {
      memo.put(i, Math.min(dp(i - 1) + cost[i - 1], dp(i - 2) + cost[i - 2]));
    }

    return memo.get(i);
  }
}
