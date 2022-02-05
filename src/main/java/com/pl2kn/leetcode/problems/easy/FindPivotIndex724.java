package com.pl2kn.leetcode.problems.easy;

public class FindPivotIndex724 {

  public int pivotIndex(int[] nums) {
    int length = nums.length;
    int[] sums = new int[length + 1];
    for (int i = 1; i < sums.length; i++) {
      sums[i] = sums[i - 1] + nums[i - 1];
    }
    for (int i = 0; i < sums.length - 1; i++) {
      if (sums[i] == sums[sums.length - 1] - sums[i] - nums[i]) {
        return i;
      }
    }
    return -1;
  }
}
