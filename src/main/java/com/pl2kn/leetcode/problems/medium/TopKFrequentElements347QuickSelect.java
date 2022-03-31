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

    int[] unique = new int[n];
    int i = 0;
    for (int num : counts.keySet()) {
      unique[i++] = num;
    }

    int left = 0;
    int right = n - 1;
    int index = n - k;
    while (left <= right) {
      index = partition(unique, left, right);
      if (index == n - k) {
        break;
      }
      if (index < n - k) {
        left = left + 1;
      } else {
        right = right - 1;
      }
    }

    int[] result = new int[k];
    int m = 0;
    for (int j = index; j < n; j++) {
      result[m++] = unique[j];
    }

    return result;
  }

  private int partition(int[] array, int left, int right) {
    int pivot = array[left];
    int index = left;
    for (int i = left + 1; i <= right; i++) {
      if (counts.get(array[i]) < counts.get(pivot)) {
        swap(array, ++index, i);
      }
    }
    swap(array, left, index);

    return index;
  }

  private void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
