package com.pl2kn.leetcode.problems.medium;

public class ComplementIOfBase10Integer1009 {

  public int bitwiseComplement(int n) {
    int bitCount = 0;
    int num = n;
    while (num > 0) {
      bitCount++;
      num >>= 1;
    }

    int bitmask = (int) Math.pow(2, bitCount) - 1;

    return n ^ bitmask;
  }
}
