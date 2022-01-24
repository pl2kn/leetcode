package com.pl2kn.leetcode.problems.easy;

public class MaxConsecutiveOnesII487 {

  public int findMaxConsecutiveOnes(int[] nums) {
    int left = 0;
    int right = 0;
    int zeroCount = 0;
    int maxCount = 0;
    while (right < nums.length) {
      if (nums[right] == 0) {
        zeroCount++;
      }
      while (zeroCount == 2) {
        if (nums[left] == 0) {
          zeroCount--;
        }
        left++;
      }
      maxCount = Math.max(maxCount, right - left + 1);
      right++;
    }
    return maxCount;
  }
}
