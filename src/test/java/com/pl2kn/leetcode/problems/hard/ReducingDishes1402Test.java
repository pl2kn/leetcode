package com.pl2kn.leetcode.problems.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReducingDishes1402Test {

  @Test
  public void Test_Case_1() {
    ReducingDishes1402 solution = new ReducingDishes1402();
    assertEquals(14, solution.maxSatisfaction(new int[]{-1, -8, 0, 5, -9}));
  }

  @Test
  public void Test_Case_2() {
    ReducingDishes1402 solution = new ReducingDishes1402();
    assertEquals(20, solution.maxSatisfaction(new int[]{4, 3, 2}));
  }
}