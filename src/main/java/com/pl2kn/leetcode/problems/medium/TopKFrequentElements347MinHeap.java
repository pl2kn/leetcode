package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements347MinHeap {

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> counts = new HashMap<>();

    for (int num : nums) {
      counts.put(num, counts.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> counts.get(a) - counts.get(b));

    for (int num : counts.keySet()) {
      minHeap.add(num);
      if (minHeap.size() > k) {
        minHeap.remove();
      }
    }

    int[] result = new int[k];
    int i = 0;
    while (minHeap.size() > 0) {
      result[i++] = minHeap.remove();
    }

    return result;
  }
}
