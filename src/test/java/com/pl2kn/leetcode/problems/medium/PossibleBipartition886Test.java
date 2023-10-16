package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PossibleBipartition886Test {

  @Test
  public void Test_Case_1() {
    PossibleBipartition886 solution = new PossibleBipartition886();
    assertTrue(solution.possibleBipartition(4, new int[][]{{1,2}, {1,3}, {2,4}}));
  }
}