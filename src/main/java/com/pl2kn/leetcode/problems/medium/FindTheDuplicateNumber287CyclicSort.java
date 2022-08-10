package com.pl2kn.leetcode.problems.medium;

public class FindTheDuplicateNumber287CyclicSort {

  public int findDuplicate(int[] nums) {
    int n = nums.length;
    int i = 0;
    while (i < n) {
      if (nums[i] != nums[nums[i]]) {
        swap(nums, i, nums[i]);
      } else {
        return nums[i];
      }
    }

    return -1;
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
