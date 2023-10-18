package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParallelCoursesIII2050Test {

  @Test
  public void Test_Case_1() {
    ParallelCoursesIII2050 solution = new ParallelCoursesIII2050();
    assertEquals(8, solution.minimumTime(3, new int[][]{{1,3}, {2,3}}, new int[]{3, 2, 5}));
  }
}