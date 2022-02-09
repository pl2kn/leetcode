package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RotateArray189Test {

  @Test
  public void Simple_Test() {
    RotateArray189 solution = new RotateArray189();
    int[] nums = {-1, -100, 3, 99};
    solution.rotate(nums, 2);
    assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
  }
}
