package com.pl2kn.leetcode.problems.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlidingWindowMaximum239Test {

  @Test
  public void Test_Case_1() {
    SlidingWindowMaximum239 solution = new SlidingWindowMaximum239();
    solution.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);
  }
}