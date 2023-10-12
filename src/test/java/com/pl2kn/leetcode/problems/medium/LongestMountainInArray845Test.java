package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestMountainInArray845Test {

  @Test
  public void Test_Case_7() {
    LongestMountainInArray845 solution = new LongestMountainInArray845();
    assertEquals(11, solution.longestMountain(new int[]{0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0}));
  }

  @Test
  public void Test_Case_55() {
    LongestMountainInArray845 solution = new LongestMountainInArray845();
    assertEquals(3, solution.longestMountain(new int[]{0, 1, 0}));
  }
}