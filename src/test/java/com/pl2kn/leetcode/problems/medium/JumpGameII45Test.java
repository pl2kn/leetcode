package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JumpGameII45Test {

  @Test
  public void Test_Case_1() {
    JumpGameII45 solution = new JumpGameII45();
    assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
  }
}