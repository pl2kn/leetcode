package com.pl2kn.leetcode.problems.medium;

public class HouseRobberII213 {

  public int rob(int[] nums) {
    if (nums == null) {
      return 0;
    }

    int n = nums.length;

    if (n == 1) {
      return nums[0];
    }

    if (n == 2) {
      return Math.max(nums[0], nums[1]);
    }

    int[] dpFirst = new int[n];
    dpFirst[0] = nums[0];
    dpFirst[1] = Math.max(nums[0], nums[1]);

    int[] dpSecond = new int[n];
    dpSecond[1] = nums[1];
    dpSecond[2] = Math.max(nums[1], nums[2]);

    for (int i = 3; i < n; i++) {
      dpFirst[i - 1] = Math.max(nums[i - 1] + dpFirst[i - 3], dpFirst[i - 2]);
      dpSecond[i] = Math.max(nums[i] + dpSecond[i - 2], dpSecond[i - 1]);
    }

    return Math.max(dpFirst[n - 2], dpSecond[n - 1]);
  }
}
