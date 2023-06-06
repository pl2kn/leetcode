package com.pl2kn.leetcode.problems.easy;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence1502 {

  public boolean canMakeArithmeticProgression(int[] arr) {
    Arrays.sort(arr);

    int diff = arr[1] - arr[0];

    for (int i = 2; i < arr.length; i++) {
      if (arr[i] - arr[i - 1] != diff) {
        return false;
      }
    }

    return true;
  }
}
