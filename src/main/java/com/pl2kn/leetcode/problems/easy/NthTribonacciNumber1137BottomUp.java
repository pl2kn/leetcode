package com.pl2kn.leetcode.problems.easy;

public class NthTribonacciNumber1137BottomUp {

  public int tribonacci(int n) {
    int[] dp = {0, 1, 1};

    for (int i = 3; i <= n; i++) {
      dp[i % 3] = dp[0] + dp[1] + dp[2];
    }

    return dp[n];
  }
}
