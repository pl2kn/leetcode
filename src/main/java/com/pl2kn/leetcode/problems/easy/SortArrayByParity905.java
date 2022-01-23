package com.pl2kn.leetcode.problems.easy;

public class SortArrayByParity905 {

  public int[] sortArrayByParity(int[] nums) {
    for (int i = 0, j = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        int tmp = nums[j];
        nums[j++] = nums[i];
        nums[i] = tmp;
      }
    }
    return nums;
  }
}
