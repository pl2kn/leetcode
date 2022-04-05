package com.pl2kn.leetcode.problems.medium;

import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix378MinHeap {

  public int kthSmallest(int[][] matrix, int k) {
    int m = matrix.length;
    int n = matrix[0].length;
    PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

    for (int row = 0; row < Math.min(m, k); row++) {
      minHeap.add(new int[]{matrix[row][0], row, 0});
    }

    int result = -1;
    for (int i = 0; i < k; i++) {
      int[] min = minHeap.remove();
      int row = min[1];
      int col = min[2];
      result = min[0];
      if (col < n - 1) {
        minHeap.add(new int[]{matrix[row][col + 1], row, col + 1});
      }
    }

    return result;
  }
}
