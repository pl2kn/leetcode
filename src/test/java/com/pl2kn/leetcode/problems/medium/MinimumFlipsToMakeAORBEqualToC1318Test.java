package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumFlipsToMakeAORBEqualToC1318Test {

  @Test
  public void Test_Case_1() {
    MinimumFlipsToMakeAORBEqualToC1318 solution = new MinimumFlipsToMakeAORBEqualToC1318();
    assertEquals(3, solution.minFlips(2, 6, 5));
  }
}