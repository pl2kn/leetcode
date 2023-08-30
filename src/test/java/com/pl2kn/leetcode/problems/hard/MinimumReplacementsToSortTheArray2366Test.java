package com.pl2kn.leetcode.problems.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumReplacementsToSortTheArray2366Test {

  @Test
  public void Test_Case_1() {
    MinimumReplacementsToSortTheArray2366 solution = new MinimumReplacementsToSortTheArray2366();
    assertEquals(2, solution.minimumReplacement(new int[]{3, 9, 3}));
  }
}