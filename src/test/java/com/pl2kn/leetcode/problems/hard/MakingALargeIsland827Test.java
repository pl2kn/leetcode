package com.pl2kn.leetcode.problems.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MakingALargeIsland827Test {

  @Test
  public void Test_Case_1() {
    MakingALargeIsland827 solution = new MakingALargeIsland827();
    assertEquals(3, solution.largestIsland(new int[][]{{1, 0}, {0, 1}}));
  }

  @Test
  public void Test_Case_2() {
    MakingALargeIsland827 solution = new MakingALargeIsland827();
    assertEquals(4, solution.largestIsland(new int[][]{{1, 1}, {0, 1}}));
  }
}