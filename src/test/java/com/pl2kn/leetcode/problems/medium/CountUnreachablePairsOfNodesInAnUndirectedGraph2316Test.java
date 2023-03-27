package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountUnreachablePairsOfNodesInAnUndirectedGraph2316Test {

  @Test
  public void Test_Case_43() {
    CountUnreachablePairsOfNodesInAnUndirectedGraph2316 solution = new CountUnreachablePairsOfNodesInAnUndirectedGraph2316();
    assertEquals(0, solution.countPairs(11,
        new int[][]{{5, 0}, {1, 0}, {10, 7}, {9, 8}, {7, 2}, {1, 3}, {0, 2}, {8, 5}, {4, 6},
            {4, 2}}));
  }
}