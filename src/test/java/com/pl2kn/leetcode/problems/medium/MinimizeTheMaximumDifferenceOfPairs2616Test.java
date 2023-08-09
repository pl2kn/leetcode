package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimizeTheMaximumDifferenceOfPairs2616Test {

  @Test
  public void Test_Case_1() {
    MinimizeTheMaximumDifferenceOfPairs2616 solution = new MinimizeTheMaximumDifferenceOfPairs2616();
    assertEquals(1, solution.minimizeMax(new int[]{10,1,2,7,1,3}, 2));
  }
}