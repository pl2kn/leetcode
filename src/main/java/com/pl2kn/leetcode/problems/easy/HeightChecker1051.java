package com.pl2kn.leetcode.problems.easy;

public class HeightChecker1051 {

  public int heightChecker(int[] heights) {
    int[] counts = new int[102];
    for (int height : heights) {
      counts[height + 1]++;
    }
    for (int i = 1; i < 101; i++) {
      counts[i + 1] += counts[i];
    }
    int result = 0;
    for (int height : heights) {
      if (heights[counts[height]++] != height) {
        result++;
      }
    }
    return result;
  }
}
