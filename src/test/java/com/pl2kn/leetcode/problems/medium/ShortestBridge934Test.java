package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShortestBridge934Test {

  @Test
  public void Test_Case_1() {
    ShortestBridge934 solution = new ShortestBridge934();
    assertEquals(3, solution.shortestBridge(new int[][]{
        {0, 1, 0, 0, 0, 0},
        {0, 1, 1, 1, 0, 0},
        {0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0},
        {1, 1, 0, 0, 0, 0}}
    ));
  }
}
