package com.pl2kn.leetcode.problems.medium;

public class Pow50FastIterativeFast {

  public double myPow(double x, int n) {
    long m = n;
    if (n < 0) {
      x = 1 / x;
      m = -m;
    }
    double result = 1;
    for (long i = m; i > 0; i /= 2) {
      if (i % 2 == 1) {
        result *= x;
      }
      x *= x;
    }
    return result;
  }
}
