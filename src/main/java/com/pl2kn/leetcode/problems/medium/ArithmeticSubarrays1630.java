package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArithmeticSubarrays1630 {

  public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
    int m = l.length;
    List<Boolean> result = new ArrayList<>();
    for (int i = 0; i < m; i++) {
      result.add(i, check(nums, l[i], r[i]));
    }

    return result;
  }

  private boolean check(int[] nums, int left, int right) {
    int n = right - left + 1;
    int[] array = new int[n];
    int j = 0;
    for (int i = left; i <= right; i++) {
      array[j++] = nums[i];
    }

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    Set<Integer> set = new HashSet<>();
    for (int num : array) {
      min = Math.min(min, num);
      max = Math.max(max, num);
      set.add(num);
    }

    if ((max - min) % (n - 1) != 0) {
      return false;
    }

    int diff = (max - min) / (n - 1);
    int current = min + diff;
    while (current < max) {
      if (!set.contains(current)) {
        return false;
      }

      current += diff;
    }

    return true;
  }
}
