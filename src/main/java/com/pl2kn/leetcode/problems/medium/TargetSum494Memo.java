package com.pl2kn.leetcode.problems.medium;

public class TargetSum494Memo {

  private int totalSum;

  public int findTargetSumWays(int[] nums, int target) {
    totalSum = 0;
    for (int num : nums) {
      totalSum += num;
    }

    int[][] memo = new int[nums.length][totalSum * 2 + 1];
    for (int i = 0; i < memo.length; i++) {
      for (int j = 0; j < memo[i].length; j++) {
        memo[i][j] = Integer.MIN_VALUE;
      }
    }

    return helper(nums, 0, target, 0, memo);
  }

  private int helper(int[] nums, int sum, int target, int index, int[][] memo) {
    if (index == nums.length) {
      return sum == target ? 1 : 0;
    }

    if (memo[index][totalSum + sum] != Integer.MIN_VALUE) {
      return memo[index][totalSum + sum];
    }

    memo[index][totalSum + sum] = helper(nums, sum + nums[index], target, index + 1, memo)
        + helper(nums, sum - nums[index], target, index + 1, memo);

    return memo[index][totalSum + sum];
  }
}
