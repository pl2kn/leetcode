package com.pl2kn.leetcode.easy;

public class MaxConsecutiveOnes0485 {

  public int findMaxConsecutiveOnes(int[] nums) {
    int maxOnes = 0;
    int currOnes = 0;
    for (int num : nums) {
      if (num == 1) {
        currOnes++;
      } else {
        maxOnes = Math.max(maxOnes, currOnes);
        currOnes = 0;
      }
    }
    return Math.max(maxOnes, currOnes);
  }
}
