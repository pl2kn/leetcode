package com.pl2kn.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortArrayByIncreasingFrequency1636 {

  public int[] frequencySort(int[] nums) {
    Map<Integer, Integer> freq = new HashMap<>();

    for (int num : nums) {
      freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
        (a, b) -> freq.get(a) != freq.get(b) ? freq.get(a) - freq.get(b) : b - a);

    for (int num : nums) {
      maxHeap.add(num);
    }

    int[] result = new int[nums.length];
    int i = 0;
    while (!maxHeap.isEmpty()) {
      result[i++] = maxHeap.poll();
    }

    return result;
  }
}
