package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MinCostToConnectAllPoints1584Test {

  @Test
  public void Simple_Test() {
    MinCostToConnectAllPoints1584 solution = new MinCostToConnectAllPoints1584();
    assertEquals(20,
        solution.minCostConnectPoints(new int[][]{{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}}));
  }
}
