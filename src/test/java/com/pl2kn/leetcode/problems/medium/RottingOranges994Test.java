package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RottingOranges994Test {

  @Test
  public void Three_On_Three_Test() {
    RottingOranges994 solution = new RottingOranges994();
    assertEquals(4, solution.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
  }
}
