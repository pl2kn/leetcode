package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition1498 {

  public int numSubseq(int[] nums, int target) {
    Arrays.sort(nums);

    int n = nums.length;
    int mod = 100_000_007;

    int[] powers = new int[n];
    powers[0] = 1;
    for (int i = 1; i < n; i++) {
      powers[i] = powers[i - 1] * 2 % mod;
    }

    int left = 0;
    int right = n - 1;
    int result = 0;

    while (left <= right) {
      if (nums[left] + nums[right] > target) {
        right--;
      } else {
        result = (result + powers[right - left++]) % mod;
      }
    }

    return result;
  }
}
