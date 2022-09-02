package com.pl2kn.leetcode.problems.medium;

public class SingleNumberIII260 {

  public int[] singleNumber(int[] nums) {
    int xor = 0;
    for (int num : nums) {
      xor ^= num;
    }

    int diff = xor & (-xor);

    int x = 0;
    for (int num : nums) {
      if ((num & diff) != 0) {
        x ^= num;
      }
    }

    return new int[]{x, xor ^ x};
  }
}
