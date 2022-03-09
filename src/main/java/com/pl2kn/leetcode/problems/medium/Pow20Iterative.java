package com.pl2kn.leetcode.problems.medium;

public class Pow20Iterative {

  public double myPow(double x, int n) {
    if (n < 0) {
      x = 1 / x;
      n = -n;
    }
    double result = 1;
    for (int i = 0; i < n; i++) {
      result *= x;
    }
    return result;
  }
}
