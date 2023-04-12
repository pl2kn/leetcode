package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class CombinationSumIV377 {

  public int combinationSum4(int[] nums, int target) {
    int[] dp = new int[target + 1];
    Arrays.fill(dp, -1);
    dp[0] = 1;

    return combinationSum4(nums, target, dp);
  }

  private int combinationSum4(int[] nums, int target, int[] dp) {
    if (dp[target] != -1) {
      return dp[target];
    }

    int result = 0;
    for (int num : nums) {
      if (num <= target) {
        result += combinationSum4(nums, target - num, dp);
      }
    }

    return dp[target] = result;
  }
}
