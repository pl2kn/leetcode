package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DiagonalTraverse498Test {

  @Test
  public void Three_On_Three_Test() {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    DiagonalTraverse498 solution = new DiagonalTraverse498();
    assertArrayEquals(new int[]{1, 2, 4, 7, 5, 3, 6, 8, 9}, solution.findDiagonalOrder(matrix));
  }

  @Test
  public void Three_On_Two_Test() {
    int[][] matrix = {{2, 5}, {8, 4}, {0, -1}};
    DiagonalTraverse498 solution = new DiagonalTraverse498();
    assertArrayEquals(new int[]{2, 5, 8, 0, 4, -1}, solution.findDiagonalOrder(matrix));
  }
}
