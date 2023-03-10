package com.pl2kn.leetcode.problems.medium;

import java.util.Random;

public class ShuffleAnArray384 {

  class Solution {

    private final Random random;
    private final int[] nums;

    public Solution(int[] nums) {
      this.nums = nums;
      random = new Random();
    }

    public int[] reset() {
      return nums;
    }

    public int[] shuffle() {
      int[] result = new int[nums.length];

      System.arraycopy(nums, 0, result, 0, nums.length);

      for (int i = 0; i < nums.length; i++) {
        swap(result, i, random.nextInt(nums.length));
      }

      return result;
    }

    private void swap(int[] nums, int i, int j) {
      int tmp = nums[i];
      nums[i] = nums[j];
      nums[j] = tmp;
    }
  }
}
