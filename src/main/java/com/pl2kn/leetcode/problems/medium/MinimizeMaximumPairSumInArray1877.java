package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray1877 {

  public int minPairSum(int[] nums) {
    Arrays.sort(nums);

    int result = 0;
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      result = Math.max(result, nums[left++] + nums[right--]);
    }

    return result;
  }
}
