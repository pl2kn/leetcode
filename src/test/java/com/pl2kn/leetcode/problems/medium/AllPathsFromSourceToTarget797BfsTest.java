package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AllPathsFromSourceToTarget797BfsTest {

  @Test
  public void Simple_Test() {
    AllPathsFromSourceToTarget797Bfs solution = new AllPathsFromSourceToTarget797Bfs();
    solution.allPathsSourceTarget(new int[][] {{1,2}, {3}, {3}, {}});
  }

}
