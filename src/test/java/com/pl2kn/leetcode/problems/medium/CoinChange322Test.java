package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CoinChange322Test {

  @Test
  public void Simple_Test() {
    CoinChange322 solution = new CoinChange322();
    assertEquals(3, solution.coinChange(new int[]{5, 2, 1}, 11));
  }
}
