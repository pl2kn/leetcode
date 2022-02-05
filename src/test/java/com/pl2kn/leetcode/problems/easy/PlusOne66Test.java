package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PlusOne66Test {

  @Test
  public void Simple_Test() {
    int[] nums = {1, 2, 3};
    PlusOne66 solution = new PlusOne66();
    assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(nums));
  }

  @Test
  public void Nines_Test_Test() {
    int[] nums = {9, 9, 9};
    PlusOne66 solution = new PlusOne66();
    assertArrayEquals(new int[]{1, 0, 0, 0}, solution.plusOne(nums));
  }
}
