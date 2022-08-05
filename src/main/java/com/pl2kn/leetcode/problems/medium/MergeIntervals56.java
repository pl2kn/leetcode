package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals56 {

  public int[][] merge(int[][] intervals) {
    if (intervals.length < 2) {
      return intervals;
    }

    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    LinkedList<int[]> result = new LinkedList<>();

    for (int[] interval : intervals) {
      if (result.isEmpty() || result.getLast()[1] < interval[0]) {
        result.add(interval);
      } else {
        result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
      }
    }

    return result.toArray(new int[result.size()][]);
  }
}
