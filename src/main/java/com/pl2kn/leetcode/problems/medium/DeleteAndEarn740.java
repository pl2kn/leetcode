package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class DeleteAndEarn740 {

  private final Map<Integer, Integer> points = new HashMap<>();

  public int deleteAndEarn(int[] nums) {
    int maxNum = 1;

    for (int num : nums) {
      points.put(num, points.getOrDefault(num, 0) + num);
      maxNum = Math.max(maxNum, num);
    }

    int[] dp = new int[maxNum + 1];
    dp[1] = points.getOrDefault(1, 0);

    for (int i = 2; i < dp.length; i++) {
      dp[i] = Math.max(dp[i - 1], dp[i - 2] + points.getOrDefault(i, 0));
    }

    return dp[maxNum];
  }
}
