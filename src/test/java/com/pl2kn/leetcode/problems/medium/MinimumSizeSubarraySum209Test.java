package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MinimumSizeSubarraySum209Test {

  @Test
  public void Simple_Test() {
    MinimumSizeSubarraySum209 solution = new MinimumSizeSubarraySum209();
    assertEquals(2, solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
  }
}
