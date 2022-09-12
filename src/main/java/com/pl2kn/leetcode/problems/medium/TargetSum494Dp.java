package com.pl2kn.leetcode.problems.medium;

public class TargetSum494Dp {

  public int findTargetSumWays(int[] nums, int target) {
    int totalSum = 0;
    for (int num : nums) {
      totalSum += num;
    }

    if (totalSum < target || (target + totalSum) % 2 == 1) {
      return 0;
    }

    int sum = (target + totalSum) / 2;
    int n = nums.length;
    int[][] dp = new int[n][sum + 1];

    for (int i = 0; i < n; i++) {
      dp[i][0] = 1;
    }

    for (int s = 1; s <= sum; s++) {
      dp[0][s] = nums[0] == s ? 1 : 0;
    }

    for (int i = 1; i < n; i++) {
      for (int s = 1; s <= sum; s++) {
        dp[i][s] = dp[i - 1][s];
        if (nums[i] <= s) {
          dp[i][s] += dp[i - 1][s - nums[i]];
        }
      }
    }

    return dp[n - 1][sum];
  }
}
