package com.pl2kn.leetcode.problems.medium;

public class ShortestUnsortedContinuousSubarray581 {

  public int findUnsortedSubarray(int[] nums) {
    int n = nums.length;

    int left = 0;
    while (left < n - 1 && nums[left] <= nums[left + 1]) {
      left++;
    }

    if (left == n - 1) {
      return 0;
    }

    int right = n - 1;
    while (right > 0 && nums[right] >= nums[right - 1]) {
      right--;
    }

    int subArrayMin = Integer.MAX_VALUE;
    int subArrayMax = Integer.MIN_VALUE;
    for (int i = left; i <= right; i++) {
      subArrayMin = Math.min(subArrayMin, nums[i]);
      subArrayMax = Math.max(subArrayMax, nums[i]);
    }

    while (left > 0 && nums[left - 1] > subArrayMin) {
      left--;
    }

    while (right < n - 1 && nums[right + 1] < subArrayMax) {
      right++;
    }

    return right - left + 1;
  }
}
