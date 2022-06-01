package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class LongestIncreasingSubsequence300 {

  public int lengthOfLIS(int[] nums) {
    int n = nums.length;
    int[] dp = new int[n];

    Arrays.fill(dp, 1);

    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
    }

    int result = 0;
    for (int i = 0; i < n; i++) {
      result = Math.max(result, dp[i]);
    }

    return result;
  }
}
