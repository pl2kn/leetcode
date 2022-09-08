package com.pl2kn.leetcode.problems.medium;

public class PartitionEqualSubsetSum416BottomUp {

  public boolean canPartition(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }

    if (sum % 2 != 0) {
      return false;
    }

    sum /= 2;
    int n = nums.length;
    boolean[][] dp = new boolean[nums.length][sum + 1];

    for (int i = 0; i < n; i++) {
      dp[i][0] = true;
    }

    for (int s = 1; s <= sum; s++) {
      if (nums[0] == s) {
        dp[0][s] = true;
      }
    }

    for (int i = 1; i < n; i++) {
      for (int s = 1; s <= sum; s++) {
        if (dp[i - 1][s]) {
          dp[i][s] = dp[i - 1][s];
        } else if (nums[i] <= s) {
          dp[i][s] = dp[i - 1][s - nums[i]];
        }
      }
    }

    return dp[n - 1][sum];
  }
}
