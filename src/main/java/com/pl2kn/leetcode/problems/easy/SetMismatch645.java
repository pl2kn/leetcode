package com.pl2kn.leetcode.problems.easy;

public class SetMismatch645 {

  public int[] findErrorNums(int[] nums) {
    int duplicate = -1;
    for (int num : nums) {
      if (nums[Math.abs(num) - 1] < 0) {
        duplicate = Math.abs(num);
      } else {
        nums[Math.abs(num) - 1] *= -1;
      }
    }

    int missing = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        missing = i + 1;
        break;
      }
    }

    return new int[]{duplicate, missing};
  }
}
