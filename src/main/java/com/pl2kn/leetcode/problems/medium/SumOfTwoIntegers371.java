package com.pl2kn.leetcode.problems.medium;

public class SumOfTwoIntegers371 {

  public int getSum(int a, int b) {
    while (b != 0) {
      int carry = a & b;
      a ^= b;
      b = carry << 1;
    }

    return a;
  }
}
