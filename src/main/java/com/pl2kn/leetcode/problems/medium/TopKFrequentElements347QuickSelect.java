package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements347QuickSelect {
  private final Map<Integer, Integer> counts = new HashMap<>();

  public int[] topKFrequent(int[] nums, int k) {
    for (int num : nums) {
      counts.put(num, counts.containsKey(num) ? counts.get(num) + 1 : 1);
    }

    int n = counts.size();
    int[] uniqueNums = new int[n];
    int i = 0;
    for (int num : counts.keySet()) {
      uniqueNums[i++] = num;
    }

    int left = 0;
    int right = n - 1;
    int index = 0;
    while (left <= right) {
      index = partition(uniqueNums, left, right);
      if (index == k) {
        break;
      }
      if (index > k) {
        right = index - 1;
      } else {
        left = index + 1;
      }
    }

    int[] result = new int[k];
    for (int j = 0; j < k; j++) {
      result[j] = uniqueNums[j];
    }

    return result;
  }

  private int partition(int[] nums, int left, int right) {
    int pivot = nums[left];
    int index = left;

    for (int i = left + 1; i <= right; i++) {
      if (counts.get(nums[i]) > counts.get(pivot)) {
        swap(nums, i, ++index);
      }
    }

    swap(nums, left, index);

    return index;
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
