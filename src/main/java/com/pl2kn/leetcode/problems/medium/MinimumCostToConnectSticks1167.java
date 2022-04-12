package com.pl2kn.leetcode.problems.medium;

import java.util.PriorityQueue;

public class MinimumCostToConnectSticks1167 {

  public int connectSticks(int[] sticks) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for (int stick : sticks) {
      minHeap.add(stick);
    }

    int totalCost = 0;
    while (minHeap.size() > 1) {
      int cost = minHeap.remove() + minHeap.remove();
      totalCost += cost;
      minHeap.add(cost);
    }

    return totalCost;
  }
}
