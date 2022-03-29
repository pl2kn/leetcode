package com.pl2kn.leetcode.problems.medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray215 {

  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    for (Integer num : nums) {
      heap.add(num);
      if (heap.size() > k) {
        heap.remove();
      }
    }
    return heap.remove();
  }
}
