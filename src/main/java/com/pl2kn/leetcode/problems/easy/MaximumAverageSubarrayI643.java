package com.pl2kn.leetcode.problems.easy;

public class MaximumAverageSubarrayI643 {

  public double findMaxAverage(int[] nums, int k) {
    int sum = 0;
    double result = -Double.MAX_VALUE;
    int left = 0;

    for (int right = 0; right < nums.length; right++) {
      sum += nums[right];
      if (right >= k - 1) {
        result = Math.max(result, (double) sum / k);
        sum -= nums[left];
        left++;
      }
    }

    return result;
  }
}
