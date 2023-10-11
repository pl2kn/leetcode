package com.pl2kn.leetcode.problems.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberOfFlowersInFullBloom2251Test {

  @Test
  public void Test_Case_1() {
    NumberOfFlowersInFullBloom2251 solution = new NumberOfFlowersInFullBloom2251();
    assertArrayEquals(
        new int[]{1, 2, 2, 2},
        solution.fullBloomFlowers(
            new int[][]{{1, 6}, {3, 7}, {9, 12}, {4, 13}},
            new int[]{2, 3, 7, 11}
        )
    );
  }
}