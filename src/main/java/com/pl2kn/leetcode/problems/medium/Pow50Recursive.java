package com.pl2kn.leetcode.problems.medium;

public class Pow50Recursive {

  public double myPow(double x, int n) {
    long m = n;
    if (m < 0) {
      x = 1 / x;
      m = - m;
    }
    return pow(x, m);
  }

  private double pow(double x, long n) {
    if (n == 0) {
      return 1;
    }
    if (n == 1) {
      return x;
    }
    double tmp = pow(x, n / 2);
    double result = tmp * tmp;
    if (n % 2 == 1) {
      result *= x;
    }
    return result;
  }
}
