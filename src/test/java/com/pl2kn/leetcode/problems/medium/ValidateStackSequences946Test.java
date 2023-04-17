package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateStackSequences946Test {

  @Test
  public void Test_Case_1() {
    ValidateStackSequences946 solution = new ValidateStackSequences946();
    assertTrue(solution.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
  }
}