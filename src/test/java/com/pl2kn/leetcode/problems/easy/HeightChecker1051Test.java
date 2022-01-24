package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HeightChecker1051Test {

  @Test
  public void Simple_Test() {
    int[] heights = {1, 1, 4, 2, 1, 3};
    HeightChecker1051 solution = new HeightChecker1051();
    assertEquals(3, solution.heightChecker(heights));
  }

  @Test
  public void All_Wrong_Test() {
    int[] heights = {5, 1, 2, 3, 4};
    HeightChecker1051 solution = new HeightChecker1051();
    assertEquals(5, solution.heightChecker(heights));
  }
}
