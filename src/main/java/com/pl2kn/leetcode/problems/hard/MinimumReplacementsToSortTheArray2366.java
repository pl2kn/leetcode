package com.pl2kn.leetcode.problems.hard;


public class MinimumReplacementsToSortTheArray2366 {

  public long minimumReplacement(int[] nums) {
    long result = 0;
    for (int i = nums.length - 2; i >= 0; i--) {
      if (nums[i] <= nums[i + 1]) {
        continue;
      }

      int elementCount;
      if (nums[i] % nums[i + 1] == 0) {
        elementCount = nums[i] / nums[i + 1];
      } else {
        elementCount = nums[i] / nums[i + 1] + 1;
      }

      result += elementCount - 1;

      nums[i] = nums[i] / elementCount;
    }

    return result;
  }
}
