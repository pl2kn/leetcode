package com.pl2kn.leetcode.problems.easy;

import java.util.Arrays;

public class HeightChecker1051 {

  public int heightChecker(int[] heights) {
    int length = heights.length;
    int[] expected = new int[length];
    for (int i = 0; i < length; i++) {
      expected[i] = heights[i];
    }
    Arrays.sort(expected);
    int count = 0;
    for (int i = 0; i < length; i++) {
      if (heights[i] != expected[i]) {
        count++;
      }
    }
    return count;
  }
}
