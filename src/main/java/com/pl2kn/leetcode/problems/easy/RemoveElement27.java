package com.pl2kn.leetcode.problems.easy;

public class RemoveElement27 {

  public int removeElement(int[] nums, int val) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[k++] = nums[i];
      }
    }
    return k;
  }
}
