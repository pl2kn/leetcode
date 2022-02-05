package com.pl2kn.leetcode.problems.easy;

public class FindPivotIndex724 {

  public int pivotIndex(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    int leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (leftSum == sum - leftSum - nums[i]) {
        return i;
      }
      leftSum += nums[i];
    }
    return -1;
  }
}
