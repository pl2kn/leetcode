package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NonOverlappingIntervals435Test {

  @Test
  public void Test_Case_1() {
    NonOverlappingIntervals435 solution = new NonOverlappingIntervals435();
    assertEquals(1, solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
  }
}