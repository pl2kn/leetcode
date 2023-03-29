package com.pl2kn.leetcode.problems.hard;

import java.util.Arrays;

public class ReducingDishes1402 {

  public int maxSatisfaction(int[] satisfaction) {
    Arrays.sort(satisfaction);
    return maxSatisfaction(satisfaction, 0, 1, new Integer[satisfaction.length][satisfaction.length + 1]);
  }

  private int maxSatisfaction(int[] satisfaction, int dish, int time, Integer[][] dp) {
    if (dish >= satisfaction.length) {
      return 0;
    }

    if (dp[dish][time] != null) {
      return dp[dish][time];
    }

    return dp[dish][time] = Math.max(
        satisfaction[dish] * time + maxSatisfaction(satisfaction, dish + 1, time + 1, dp),
        maxSatisfaction(satisfaction, dish + 1, time, dp)
    );
  }
}
