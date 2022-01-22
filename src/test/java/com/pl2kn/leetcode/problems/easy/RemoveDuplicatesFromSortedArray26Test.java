package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArray26Test {

  @Test
  public void Simple_Test() {
    int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    RemoveDuplicatesFromSortedArray26 solution = new RemoveDuplicatesFromSortedArray26();
    assertEquals(5, solution.removeDuplicates(nums));
  }
}
