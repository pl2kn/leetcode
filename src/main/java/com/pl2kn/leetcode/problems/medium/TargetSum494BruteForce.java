package com.pl2kn.leetcode.problems.medium;

public class TargetSum494BruteForce {

  private int count;

  public int findTargetSumWays(int[] nums, int target) {
    count = 0;

    helper(nums, target, 0);

    return count;
  }

  private void helper(int[] nums, int target, int index) {
    if (index == nums.length) {
      if (target == 0) {
        count++;
      }
    } else {
      helper(nums, target - nums[index], index + 1);
      helper(nums, target + nums[index], index + 1);
    }
  }
}
