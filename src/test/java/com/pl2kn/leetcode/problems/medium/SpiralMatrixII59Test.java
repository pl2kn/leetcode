package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpiralMatrixII59Test {

  @Test
  public void Test_Case_1() {
    SpiralMatrixII59 solution = new SpiralMatrixII59();
    assertArrayEquals(new int[][]{{1,2,3}, {8,9,4}, {7,6,5}}, solution.generateMatrix(3));
  }
}