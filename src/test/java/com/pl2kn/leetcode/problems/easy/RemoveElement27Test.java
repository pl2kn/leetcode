package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RemoveElement27Test {

  @Test
  public void Simple_Test() {
    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
    RemoveElement27 solution = new RemoveElement27();
    assertEquals(5, solution.removeElement(nums, 2));
  }
}
