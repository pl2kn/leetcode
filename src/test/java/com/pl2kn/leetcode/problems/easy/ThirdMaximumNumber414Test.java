package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ThirdMaximumNumber414Test {

  @Test
  public void Simple_Test() {
    int[] nums = {2, 2, 3, 1};
    ThirdMaximumNumber414 solution = new ThirdMaximumNumber414();
    assertEquals(1, solution.thirdMax(nums));
  }
}
