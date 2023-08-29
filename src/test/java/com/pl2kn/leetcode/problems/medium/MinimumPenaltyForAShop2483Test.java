package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumPenaltyForAShop2483Test {

  @Test
  public void Test_Case() {
    MinimumPenaltyForAShop2483 solution = new MinimumPenaltyForAShop2483();
    assertEquals(2, solution.bestClosingTime("YYNY"));
  }
}