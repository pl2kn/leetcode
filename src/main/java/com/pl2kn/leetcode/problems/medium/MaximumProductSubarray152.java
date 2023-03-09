package com.pl2kn.leetcode.problems.medium;

public class MaximumProductSubarray152 {

  public int maxProduct(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int result = nums[0];
    int currentMax = nums[0];
    int currentMin = nums[0];
    for (int num : nums) {
      int currentMaxTmp = currentMax;
      currentMax = Math.max(Math.max(currentMax * num, currentMin * num), num);
      currentMin = Math.min(Math.max(currentMin * num, currentMaxTmp * num), num);
      result = Math.max(result, currentMax);
    }

    return result;
  }
}
