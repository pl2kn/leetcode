package com.pl2kn.leetcode.problems.medium;

public class SingleNumberII137 {

  public int singleNumber(int[] nums) {
    int seenOnce = 0;
    int seenTwice = 0;

    for (int num : nums) {
      seenOnce = ~seenTwice & (seenOnce ^ num);
      seenTwice = ~seenOnce & (seenTwice ^ num);
    }

    return seenOnce;
  }
}
