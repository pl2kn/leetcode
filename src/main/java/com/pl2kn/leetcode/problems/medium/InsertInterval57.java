package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;
import java.util.LinkedList;

public class InsertInterval57 {

  public int[][] insert(int[][] intervals, int[] newInterval) {
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

    LinkedList<int[]> result = new LinkedList<>();
    int n = intervals.length;
    int i = 0;

    while (i < n && newInterval[0] > intervals[i][1]) {
      result.add(intervals[i++]);
    }

    while (i < n && newInterval[1] >= intervals[i][0]) {
      newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
      newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
      i++;
    }

    result.add(newInterval);

    while (i < n) {
      result.add(intervals[i++]);
    }

    return result.toArray(new int[result.size()][]);
  }
}
