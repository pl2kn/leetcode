package com.pl2kn.leetcode.problems.easy;

public class LargestNumberAtLeastTwiceOfOthers747 {

  public int dominantIndex(int[] nums) {
    int maxIndex = 0;
    int max = -1;
    int secondMax = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        secondMax = max;
        max = nums[i];
        maxIndex = i;
      } else if (nums[i] > secondMax) {
        secondMax = nums[i];
      }
    }
    return max >= secondMax * 2 ? maxIndex : -1;
  }
}
