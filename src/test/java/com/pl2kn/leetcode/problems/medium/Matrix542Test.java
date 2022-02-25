package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Matrix542Test {

  @Test
  public void Simple_Test() {
    Matrix542 solution = new Matrix542();
    assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}},
        solution.updateMatrix(new int[][]{{0, 0, 0,}, {0, 1, 0}, {1, 1, 1}}));
  }
}
