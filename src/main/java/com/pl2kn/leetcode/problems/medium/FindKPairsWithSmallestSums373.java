package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSums373 {

  public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    PriorityQueue<List<Integer>> maxHeap = new PriorityQueue<>(
        (list1, list2) -> (list2.get(0) + list2.get(1)) - (list1.get(0) + list1.get(1))
    );

    for (int num1 : nums1) {
      for (int num2 : nums2) {
        if (maxHeap.size() < k) {
          maxHeap.add(Arrays.asList(num1, num2));
        } else {
          if (num1 + num2 > maxHeap.peek().get(0) + maxHeap.peek().get(1)) {
            break;
          } else {
            maxHeap.remove();
            maxHeap.add(Arrays.asList(num1, num2));
          }
        }
      }
    }

    return new ArrayList<>(maxHeap);
  }
}
