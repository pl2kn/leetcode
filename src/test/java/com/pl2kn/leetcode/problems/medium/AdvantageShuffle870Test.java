package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdvantageShuffle870Test {

  @Test
  public void Test_Case() {
    AdvantageShuffle870 solution = new AdvantageShuffle870();
    assertArrayEquals(
        new int[]{2, 11, 7, 15},
        solution.advantageCount(new int[]{2, 7, 11, 15}, new int[]{1, 10, 4, 11})
    );
  }
}