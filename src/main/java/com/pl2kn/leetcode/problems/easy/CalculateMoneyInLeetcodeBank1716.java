package com.pl2kn.leetcode.problems.easy;

public class CalculateMoneyInLeetcodeBank1716 {

  public int totalMoney(int n) {
    int total = 0;
    int monday = 1;
    while (n > 0) {
      for (int day = 0; day < Math.min(n, 7); day++) {
        total += monday + day;
      }

      n -= 7;
      monday++;
    }

    return total;
  }
}
