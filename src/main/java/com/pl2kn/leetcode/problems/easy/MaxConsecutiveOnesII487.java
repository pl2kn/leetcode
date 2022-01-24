package com.pl2kn.leetcode.problems.easy;

public class MaxConsecutiveOnesII487 {

  public int findMaxConsecutiveOnes(int[] nums) {
    int maxCount = 0;
    int count = 0;
    boolean flipped = false;
    int flippedIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if (num == 0 && !flipped) {
        num = 1;
        flipped = true;
        flippedIndex = i;
      }
      if (num == 1) {
        count++;
      } else {
        maxCount = Math.max(count, maxCount);
        count = 0;
        flipped = false;
        i = flippedIndex;
      }
    }
    return Math.max(count, maxCount);
  }
}
