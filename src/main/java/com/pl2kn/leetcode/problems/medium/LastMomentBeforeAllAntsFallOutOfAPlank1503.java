package com.pl2kn.leetcode.problems.medium;

public class LastMomentBeforeAllAntsFallOutOfAPlank1503 {

  public int getLastMoment(int n, int[] left, int[] right) {
    int result = 0;

    for (int rightDist : right) {
      result = Math.max(n - rightDist, result);
    }

    for (int leftDist : left) {
      result = Math.max(leftDist, result);
    }

    return result;
  }
}
