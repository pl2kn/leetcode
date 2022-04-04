package com.pl2kn.leetcode.problems.medium;

import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix378 {

  public int kthSmallest(int[][] matrix, int k) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        maxHeap.add(matrix[i][j]);
        if (maxHeap.size() > k) {
          maxHeap.remove();
        }
      }
    }
    return maxHeap.remove();
  }
}
