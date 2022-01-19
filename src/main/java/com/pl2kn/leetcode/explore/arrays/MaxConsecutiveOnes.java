package com.pl2kn.leetcode.explore.arrays;

public class MaxConsecutiveOnes {

  public int findMaxConsecutiveOnes(int[] nums) {
    int length = nums.length;
    int maxOnes = 0;
    int currOnes = 0;
    for (int i = 0; i < length; i++) {
      if (nums[i] == 1) {
        currOnes++;
      }
      if (nums[i] != 1 || i == length - 1) {
        if (currOnes > maxOnes) {
          maxOnes = currOnes;
        }
        currOnes = 0;
      }
    }
    return maxOnes;
  }
}
