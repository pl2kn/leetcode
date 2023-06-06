package com.pl2kn.leetcode.problems.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CanMakeArithmeticProgressionFromSequence1502 {

  public boolean canMakeArithmeticProgression(int[] arr) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int num : arr) {
      min = Math.min(min, num);
      max = Math.max(max, num);
    }

    if (max - min == 0) {
      return false;
    }

    int n = arr.length;

    if ((max - min) % (n - 1) != 0) {
      return false;
    }

    int diff = (max - min) / (n - 1);
    Set<Integer> numSet = new HashSet<>();

    for (int num : arr) {
      if ((num - min) % diff != 0) {
        return false;
      }
      numSet.add(num);
    }

    return numSet.size() == n;
  }
}
