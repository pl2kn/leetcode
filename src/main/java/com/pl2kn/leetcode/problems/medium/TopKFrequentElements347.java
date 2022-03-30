package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements347 {

  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int num : nums) {
      freq.put(num, freq.containsKey(num) ? freq.get(num) + 1 : 1);
    }
    PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));
    for (int num : freq.keySet()) {
      heap.add(num);
      if (heap.size() > k) {
        heap.remove();
      }
    }
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = heap.remove();
    }
    return result;
  }
}
