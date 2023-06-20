package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KRadiusSubarrayAverages2090Test {

  @Test
  public void Test_Case_1() {
    KRadiusSubarrayAverages2090 solution = new KRadiusSubarrayAverages2090();
    assertArrayEquals(new int[]{-1, -1, -1, 5, 4, 4, -1, -1, -1},
        solution.getAverages(new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6}, 3));
  }
}