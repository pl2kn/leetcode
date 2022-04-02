package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LastStoneWeight1046Test {

  @Test
  public void Simple_Test() {
    LastStoneWeight1046 solution = new LastStoneWeight1046();
    assertEquals(1, solution.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
  }
}
