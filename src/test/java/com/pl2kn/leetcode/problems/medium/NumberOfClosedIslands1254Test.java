package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberOfClosedIslands1254Test {

  @Test
  public void Test_Case_1() {
    NumberOfClosedIslands1254 solution = new NumberOfClosedIslands1254();
    assertEquals(2, solution.closedIsland(
            new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0}
            }
        )
    );
  }

  @Test
  public void Test_Case_39() {
    NumberOfClosedIslands1254 solution = new NumberOfClosedIslands1254();
    assertEquals(0, solution.closedIsland(
            new int[][]{
                {0,0,0,1,1,1,0,0,0,1,0,0,0,0,0,0,0,1,1,1,0,0,1,1,1,1,0,0,1,0},
                {1,1,0,1,1,1,0,1,1,1,1,1,0,1,0,1,0,1,1,0,1,0,1,1,1,1,0,0,1,0},
            }
        )
    );
  }
}