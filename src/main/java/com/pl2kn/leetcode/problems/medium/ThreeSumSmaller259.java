package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class ThreeSumSmaller259 {

  public int threeSumSmaller(int[] nums, int target) {
    Arrays.sort(nums);

    int n = nums.length;
    int count = 0;

    for (int i = 0; i < n - 2; i++) {
      int left = i + 1;
      int right = n - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];

        if (sum < target) {
          count += right - left;
          left++;
        } else {
          right--;
        }
      }
    }

    return count;
  }
}
