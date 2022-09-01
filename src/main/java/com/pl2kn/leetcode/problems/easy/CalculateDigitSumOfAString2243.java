package com.pl2kn.leetcode.problems.easy;

public class CalculateDigitSumOfAString2243 {

  public String digitSum(String s, int k) {
    StringBuilder builder = new StringBuilder(s);

    while (builder.length() > k) {
      StringBuilder builderTmp = new StringBuilder();
      int sum = 0;

      for (int i = 0; i < builder.length(); i++) {
        if (i != 0 && i % k == 0) {
          builderTmp.append(sum);
          sum = 0;
        }
        sum += builder.charAt(i) - '0';
      }

      builderTmp.append(sum);
      builder = builderTmp;
    }

    return builder.toString();
  }
}
