package com.pl2kn.leetcode.problems.easy;

public class MaximumProductDifferenceBetweenTwoPairs1913 {

  public int maxProductDifference(int[] nums) {
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;

    for (int num : nums) {
      if (num > max) {
        secondMax = max;
        max = num;
      } else {
        secondMax = Math.max(secondMax, num);
      }

      if (num < min) {
        secondMin = min;
        min = num;
      } else {
        secondMin = Math.min(secondMin, num);
      }
    }

    return max * secondMax - min * secondMin;
  }
}
