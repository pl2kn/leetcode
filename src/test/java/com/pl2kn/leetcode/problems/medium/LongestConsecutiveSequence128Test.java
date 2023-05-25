package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestConsecutiveSequence128Test {

  @Test
  public void Test_Case_1() {
    LongestConsecutiveSequence128 solution = new LongestConsecutiveSequence128();
    assertEquals(4, solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
  }

  @Test
  public void Test_Case_2() {
    LongestConsecutiveSequence128 solution = new LongestConsecutiveSequence128();
    assertEquals(9, solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
  }
}