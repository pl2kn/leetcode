package com.pl2kn.leetcode.problems.easy;

import java.util.PriorityQueue;

public class KthLargestElementInAStream703 {

  class KthLargest {

    private final int k;
    private final PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
      this.k = k;
      for (Integer num : nums) {
        add(num);
      }
    }

    public int add(int val) {
      minHeap.add(val);
      if (minHeap.size() > k) {
        minHeap.remove();
      }
      return minHeap.peek();
    }
  }
}
