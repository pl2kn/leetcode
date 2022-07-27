package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class ThreeSumClosest16 {

  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);

    int n = nums.length;
    int minDiff = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      int left = i + 1;
      int right = n - 1;

      while (left < right) {
        int diff = target - nums[i] - nums[left] - nums[right];
        if (diff == 0) {
          return target;
        }

        if (Math.abs(diff) < Math.abs(minDiff)) {
          minDiff = diff;
        }

        if (diff > 0) {
          right--;
        } else {
          left++;
        }
      }
    }

    return target - minDiff;
  }
}
