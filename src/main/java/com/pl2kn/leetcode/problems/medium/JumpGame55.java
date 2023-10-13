package com.pl2kn.leetcode.problems.medium;

public class JumpGame55 {

  public boolean canJump(int[] nums) {
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > max) {
        return false;
      }

      max = Math.max(max, i + nums[i]);
    }

    return true;
  }
}
