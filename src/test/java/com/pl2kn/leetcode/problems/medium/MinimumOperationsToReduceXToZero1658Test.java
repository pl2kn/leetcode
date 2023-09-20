package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumOperationsToReduceXToZero1658Test {

  @Test
  public void Test_Case_4() {
    MinimumOperationsToReduceXToZero1658 solution = new MinimumOperationsToReduceXToZero1658();
    assertEquals(16, solution.minOperations(
        new int[]{8828, 9581, 49, 9818, 9974, 9869, 9991, 10000, 10000, 10000, 9999, 9993, 9904,
            8819, 1231, 6309}, 134365));
  }
}