package com.pl2kn.leetcode.problems.hard;

public class FirstMissingPositive41 {

  public int firstMissingPositive(int[] nums) {
    int n = nums.length;
    int i = 0;
    while (i < n) {
      int j = nums[i] - 1;
      if (j < 0 || j >= n) {
        nums[i++] = 0;
        continue;
      }

      if (nums[i] != i + 1) {
        if (nums[i] != nums[j]) {
          swap(nums, i, j);
        } else {
          nums[i] = 0;
        }
      } else {
        i++;
      }
    }

    for (i = 0; i < n; i++) {
      if (nums[i] == 0) {
        return i + 1;
      }
    }

    return n + 1;
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
