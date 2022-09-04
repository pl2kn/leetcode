package com.pl2kn.leetcode.problems.medium;

import java.util.PriorityQueue;

public class KClosestPointsToOrigin973Heap {

  public int[][] kClosest(int[][] points, int k) {
    PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> distance(b) - distance(a));

    for (int[] point : points) {
      maxHeap.add(point);
      if (maxHeap.size() > k) {
        maxHeap.remove();
      }
    }

    return maxHeap.toArray(new int[k][]);
  }

  private int distance(int[] point) {
    return point[0] * point[0] + point[1] * point[1];
  }
}
