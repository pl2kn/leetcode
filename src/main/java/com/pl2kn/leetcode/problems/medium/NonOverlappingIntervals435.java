package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals435 {

  public int eraseOverlapIntervals(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

    int[] previous = intervals[0];
    int result = 0;
    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i][0] < previous[1]) {
        result++;
      } else {
        previous = intervals[i];
      }
    }

    return result;
  }
}
