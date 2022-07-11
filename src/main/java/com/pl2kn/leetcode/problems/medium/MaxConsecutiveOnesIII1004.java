package com.pl2kn.leetcode.problems.medium;

public class MaxConsecutiveOnesIII1004 {

  public int longestOnes(int[] nums, int k) {
    int result = 0;
    int currentCount = 0;

    for (int left = 0, right = 0; right < nums.length; right++) {
      if (nums[right] == 1) {
        currentCount++;
      }

      while (right - left + 1 - currentCount > k) {
        if (nums[left] == 1) {
          currentCount--;
        }

        left++;
      }

      result = Math.max(result, right - left + 1);
    }

    return result;
  }
}
