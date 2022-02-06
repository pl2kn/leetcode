package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SpiralMatrix54Test {

  @Test
  public void Three_On_Three_Test() {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    SpiralMatrix54 solution = new SpiralMatrix54();
    solution.spiralOrder(matrix);
  }

  @Test
  public void Four_On_Three_Test() {
    int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    SpiralMatrix54 solution = new SpiralMatrix54();
    solution.spiralOrder(matrix);
  }
}
