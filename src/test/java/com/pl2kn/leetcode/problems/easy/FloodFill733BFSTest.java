package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FloodFill733BFSTest {

  @Test
  public void Two_On_Three_The_Same_Color_Test() {
    FloodFill733BFS solution = new FloodFill733BFS();
    assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 1}}, solution.floodFill(new int[][]{{0, 0, 0}, {0, 1, 1}}, 1, 1, 1));
  }
}
