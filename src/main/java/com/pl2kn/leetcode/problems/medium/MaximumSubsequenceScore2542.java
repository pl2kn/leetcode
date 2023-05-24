package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumSubsequenceScore2542 {

  public long maxScore(int[] nums1, int[] nums2, int k) {
    int n = nums1.length;

    int[][] pairs = new int[n][2];
    for (int i = 0; i < n; i++) {
      pairs[i] = new int[]{nums1[i], nums2[i]};
    }
    Arrays.sort(pairs, (a, b) -> b[1] - a[1]);

    PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
    long currentSum = 0;
    for (int i = 0; i < k; i++) {
      int num = pairs[i][0];
      currentSum += num;
      minHeap.add(num);
    }

    long result = currentSum * pairs[k - 1][1];

    for (int i = k; i < n; i++) {
      int num = pairs[i][0];
      currentSum += num - minHeap.poll();
      minHeap.add(num);

      result = Math.max(result, currentSum * pairs[i][1]);
    }

    return result;
  }
}
