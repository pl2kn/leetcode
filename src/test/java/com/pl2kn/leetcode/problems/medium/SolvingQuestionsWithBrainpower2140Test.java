package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolvingQuestionsWithBrainpower2140Test {

  @Test
  public void Test_Case_1() {
    SolvingQuestionsWithBrainpower2140TopDown solution = new SolvingQuestionsWithBrainpower2140TopDown();
    assertEquals(5, solution.mostPoints(new int[][]{{3, 2}, {4, 3}, {4, 4}, {2, 5}}));
  }

  @Test
  public void Test_Case_2() {
    SolvingQuestionsWithBrainpower2140TopDown solution = new SolvingQuestionsWithBrainpower2140TopDown();
    assertEquals(7, solution.mostPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}}));
  }
}