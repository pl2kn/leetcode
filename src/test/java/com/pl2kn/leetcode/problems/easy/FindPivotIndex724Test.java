package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FindPivotIndex724Test {

  @Test
  public void Simple_Test() {
    int[] nums = {1, 7, 3, 6, 5, 6};
    FindPivotIndex724 solution = new FindPivotIndex724();
    assertEquals(3, solution.pivotIndex(nums));
  }

  @Test
  public void Not_Exists_Test() {
    int[] nums = {1, 2, 3};
    FindPivotIndex724 solution = new FindPivotIndex724();
    assertEquals(-1, solution.pivotIndex(nums));
  }

  @Test
  public void Leftmost_Exists_Test() {
    int[] nums = {2, 1, -1};
    FindPivotIndex724 solution = new FindPivotIndex724();
    assertEquals(0, solution.pivotIndex(nums));
  }
}
