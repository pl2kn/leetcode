package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SquaresOfASortedArray977Test {

  @Test
  public void Simple_Test() {
    SquaresOfASortedArray977 solution = new SquaresOfASortedArray977();
    assertArrayEquals(new int[]{0, 1, 9, 16, 100}, solution.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
  }
}
