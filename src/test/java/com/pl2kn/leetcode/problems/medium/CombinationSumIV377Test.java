package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CombinationSumIV377Test {

  @Test
  public void Test_Case_1() {
    CombinationSumIV377 solution = new CombinationSumIV377();
    assertEquals(7, solution.combinationSum4(new int[]{1, 2, 3}, 4));
  }
}