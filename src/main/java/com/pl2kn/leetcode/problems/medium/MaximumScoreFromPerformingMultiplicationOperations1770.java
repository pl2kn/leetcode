package com.pl2kn.leetcode.problems.medium;

public class MaximumScoreFromPerformingMultiplicationOperations1770 {

  private int m;
  private int n;
  private int[] multipliers;
  private int[] nums;
  private int[][] memo;

  public int maximumScore(int[] nums, int[] multipliers) {
    m = multipliers.length;
    n = nums.length;
    this.nums = nums;
    this.multipliers = multipliers;
    this.memo = new int[m][m];

    return dp(0, 0);
  }

  private int dp(int i, int left) {
    if (i == m) {
      return 0;
    }

    int multiplier = multipliers[i];
    int right = n - 1 - (i - left);

    if (memo[i][left] == 0) {
      memo[i][left] = Math.max(multiplier * nums[left] + dp(i + 1, left + 1), multiplier * nums[right] + dp(i + 1, left));
    }

    return memo[i][left];
  }
}
