package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HappyNumber202FloydTest {

  @Test
  public void Simple_Test() {
    HappyNumber202Floyd solution = new HappyNumber202Floyd();
    assertTrue(solution.isHappy(19));
  }
}
