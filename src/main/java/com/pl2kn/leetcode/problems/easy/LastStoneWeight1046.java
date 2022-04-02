package com.pl2kn.leetcode.problems.easy;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight1046 {

  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
    for (int stone : stones) {
      heap.add(stone);
    }
    while (heap.size() > 1) {
      int result = heap.remove() - heap.remove();
      if (result > 0) {
        heap.add(result);
      }
    }
    return heap.isEmpty() ? 0 : heap.remove();
  }
}
