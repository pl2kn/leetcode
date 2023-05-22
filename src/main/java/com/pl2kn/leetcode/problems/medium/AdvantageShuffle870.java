package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class AdvantageShuffle870 {

  public int[] advantageCount(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);

    int n = nums1.length;
    int[] result = new int[n];

    int left = 0;
    int right = n - 1;
    PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
    for (int i = 0; i < n; i++) {
      maxHeap.add(new int[]{nums2[i], i});
    }

    while (!maxHeap.isEmpty()) {
      int[] num = maxHeap.remove();
      int index = num[1];
      int value = num[0];
      result[index] = nums1[right] > value ? nums1[right--] : nums1[left++];
    }

    return result;
  }
}
