package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumberOfProvinces547Test {

  @Test
  public void Simple_Test() {
    NumberOfProvinces547UnionFind solution = new NumberOfProvinces547UnionFind();
    assertEquals(2, solution.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
  }
}
