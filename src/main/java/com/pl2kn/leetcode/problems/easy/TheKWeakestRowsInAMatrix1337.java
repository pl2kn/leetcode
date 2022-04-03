package com.pl2kn.leetcode.problems.easy;

import java.util.PriorityQueue;

public class TheKWeakestRowsInAMatrix1337 {

  public int[] kWeakestRows(int[][] mat, int k) {
    PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) ->
        a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]
    );

    for (int i = 0; i < mat.length; i++) {
      maxHeap.add(new int[]{oneCount(mat[i]), i});
      if (maxHeap.size() > k) {
        maxHeap.remove();
      }
    }

    int[] result = new int[k];
    while (k > 0) {
      result[--k] = maxHeap.remove()[1];
    }

    return result;
  }

  private int oneCount(int[] row) {
    int left = 0;
    int right = row.length;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (row[mid] == 1) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return left;
  }
}
