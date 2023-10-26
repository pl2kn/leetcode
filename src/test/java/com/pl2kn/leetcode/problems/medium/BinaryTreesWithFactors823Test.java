package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTreesWithFactors823Test {

  @Test
  public void Test_Case_1() {
    BinaryTreesWithFactors823 solution = new BinaryTreesWithFactors823();
    assertEquals(3, solution.numFactoredBinaryTrees(new int[]{2, 4}));
  }

  @Test
  public void Test_Case_2() {
    BinaryTreesWithFactors823 solution = new BinaryTreesWithFactors823();
    assertEquals(7, solution.numFactoredBinaryTrees(new int[]{2, 4, 5, 10}));
  }
}