package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReorderRoutesToMakeAllPathsLeadToTheCityZero1466Test {

  @Test
  public void Test_Case_11() {
    ReorderRoutesToMakeAllPathsLeadToTheCityZero1466 solution = new ReorderRoutesToMakeAllPathsLeadToTheCityZero1466();
    assertEquals(2, solution.minReorder(5, new int[][]{{4, 3}, {2, 3}, {1, 2}, {1, 0}}));
  }
}