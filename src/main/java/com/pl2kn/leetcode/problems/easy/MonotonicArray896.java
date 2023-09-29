package com.pl2kn.leetcode.problems.easy;

public class MonotonicArray896 {

  public boolean isMonotonic(int[] nums) {
    boolean isInc = false;
    boolean isDec = false;

    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] < nums[i + 1]) {
        isInc = true;
      } else if (nums[i] > nums[i + 1]) {
        isDec = true;
      }

      if (isInc && isDec) {
        return false;
      }
    }

    return true;
  }
}
