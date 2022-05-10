package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NetworkDelayTime743Test {

  @Test
  public void Simple_Test() {
    NetworkDelayTime743 solution = new NetworkDelayTime743();
    assertEquals(2, solution.networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}}, 4, 2));
  }
}
