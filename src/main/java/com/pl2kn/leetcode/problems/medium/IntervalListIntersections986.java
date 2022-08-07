package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections986 {

  public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
    if (firstList == null || secondList == null || firstList.length == 0
        || secondList.length == 0) {
      return new int[][]{};
    }

    int i = 0;
    int j = 0;
    List<int[]> intersections = new ArrayList<>();

    while (i < firstList.length && j < secondList.length) {
      int left = Math.max(firstList[i][0], secondList[j][0]);
      int right = Math.min(firstList[i][1], secondList[j][1]);

      if (left <= right) {
        intersections.add(new int[]{left, right});
      }

      if (firstList[i][1] < secondList[j][1]) {
        i++;
      } else {
        j++;
      }
    }

    return intersections.toArray(new int[intersections.size()][]);
  }
}
