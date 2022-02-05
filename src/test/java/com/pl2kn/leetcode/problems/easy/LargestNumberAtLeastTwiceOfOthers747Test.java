package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LargestNumberAtLeastTwiceOfOthers747Test {

  @Test
  public void Two_Elements_Test() {
    int[] nums = {1, 0};
    LargestNumberAtLeastTwiceOfOthers747 solution = new LargestNumberAtLeastTwiceOfOthers747();
    assertEquals(0, solution.dominantIndex(nums));
  }
}
