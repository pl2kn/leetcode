package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumASCIIDeleteSumForTwoStrings712Test {

  @Test
  public void Test_Case_1() {
    MinimumASCIIDeleteSumForTwoStrings712 solution = new MinimumASCIIDeleteSumForTwoStrings712();
    assertEquals(231, solution.minimumDeleteSum("sea", "eat"));
  }

  @Test
  public void Test_Case_2() {
    MinimumASCIIDeleteSumForTwoStrings712 solution = new MinimumASCIIDeleteSumForTwoStrings712();
    assertEquals(403, solution.minimumDeleteSum("delete", "leet"));
  }
}