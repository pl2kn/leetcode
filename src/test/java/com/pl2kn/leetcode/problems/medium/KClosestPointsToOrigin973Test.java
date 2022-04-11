package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class KClosestPointsToOrigin973Test {

  @Test
  public void Simple_Test() {
    KClosestPointsToOrigin973 solution = new KClosestPointsToOrigin973();
    assertArrayEquals(new int[][]{{0, 1}, {1, 0}}, solution.kClosest(new int[][]{{0, 1}, {1, 0}}, 2));
  }
}
