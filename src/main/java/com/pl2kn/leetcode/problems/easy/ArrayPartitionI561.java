package com.pl2kn.leetcode.problems.easy;

import java.util.Arrays;

public class ArrayPartitionI561 {

  public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int result = 0;
    for (int i = 0; i < nums.length - 1; i += 2) {
      result += Math.min(nums[i], nums[i + 1]);
    }
    return result;
  }
}
