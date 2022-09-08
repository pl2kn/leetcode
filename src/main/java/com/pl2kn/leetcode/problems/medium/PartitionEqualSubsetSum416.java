package com.pl2kn.leetcode.problems.medium;

public class PartitionEqualSubsetSum416 {

  public boolean canPartition(int[] nums) {
    int totalSum = 0;
    for (int num : nums) {
      totalSum += num;
    }

    if (totalSum % 2 != 0) {
      return false;
    }

    int subSum = totalSum / 2;
    Boolean[][] memo = new Boolean[nums.length][subSum + 1];

    return helper(nums, subSum, 0, memo);
  }

  private boolean helper(int[] nums, int subSum, int currentIndex, Boolean[][] memo) {
    if (subSum == 0) {
      return true;
    }

    if (subSum < 0 || currentIndex >= nums.length) {
      return false;
    }

    if (memo[currentIndex][subSum] != null) {
      return memo[currentIndex][subSum];
    }

    memo[currentIndex][subSum] = helper(nums, subSum - nums[currentIndex], currentIndex + 1, memo)
        || helper(nums, subSum, currentIndex + 1, memo);

    return memo[currentIndex][subSum];
  }
}
