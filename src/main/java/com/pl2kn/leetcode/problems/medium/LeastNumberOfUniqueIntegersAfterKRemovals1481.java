package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeastNumberOfUniqueIntegersAfterKRemovals1481 {

  public int findLeastNumOfUniqueInts(int[] arr, int k) {
    Map<Integer, Integer> counts = new HashMap<>();
    for (int num : arr) {
      counts.put(num, counts.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
    minHeap.addAll(counts.entrySet());

    while (!minHeap.isEmpty() && minHeap.peek().getValue() <= k) {
      k -= minHeap.peek().getValue();
      minHeap.remove();
    }

    return minHeap.size();
  }
}
