package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MoveZeroes283Test {

  @Test
  public void Simple_Test() {
    int[] nums = {0, 1, 0, 3, 12};
    MoveZeroes283 solution = new MoveZeroes283();
    solution.moveZeroes(nums);
    assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
  }
}
