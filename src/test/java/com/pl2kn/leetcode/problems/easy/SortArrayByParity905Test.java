package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SortArrayByParity905Test {

  @Test
  public void Simple_Test() {
    int[] nums = {3, 1, 2, 4};
    SortArrayByParity905 solution = new SortArrayByParity905();
    assertArrayEquals(new int[]{2, 4, 3, 1}, solution.sortArrayByParity(nums));
  }

  @Test
  public void Array_With_Zero_Test() {
    int[] nums = {0, 1, 2};
    SortArrayByParity905 solution = new SortArrayByParity905();
    assertArrayEquals(new int[]{0, 2, 1}, solution.sortArrayByParity(nums));
  }
}
