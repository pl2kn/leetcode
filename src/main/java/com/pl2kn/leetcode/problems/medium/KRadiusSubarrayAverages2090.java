package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class KRadiusSubarrayAverages2090 {

  public int[] getAverages(int[] nums, int k) {
    int n = nums.length;

    long[] prefixSums = new long[n + 1];
    for (int i = 0; i < n; i++) {
      prefixSums[i + 1] = prefixSums[i] + nums[i];
    }

    int[] result = new int[n];
    Arrays.fill(result, -1);

    for (int i = k; i < n - k; i++) {
      long sum = prefixSums[i + k + 1] - prefixSums[i - k];
      result[i] = (int)(sum / (2 * k + 1));
    }

    return result;
  }
}
