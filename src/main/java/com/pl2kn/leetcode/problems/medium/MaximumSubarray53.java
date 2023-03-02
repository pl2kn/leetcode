package com.pl2kn.leetcode.problems.medium;

public class MaximumSubarray53 {

  public int maxSubArray(int[] nums) {
    int currentSum = nums[0];
    int maxSum = currentSum;
    for (int i = 1; i < nums.length; i++) {
      currentSum = Math.max(currentSum + nums[i], nums[i]);
      maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;
  }
}
