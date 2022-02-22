package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GetEqualSubstringsWithinBudget1208Test {

  @Test
  public void Simple_Test() {
    GetEqualSubstringsWithinBudget1208 solution = new GetEqualSubstringsWithinBudget1208();
    assertEquals(1, solution.equalSubstring("abcd", "cdef", 3));
  }
}
