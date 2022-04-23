package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SortAnArray912Test {

  @Test
  public void Odd_Test() {
    SortAnArray912 solution = new SortAnArray912();
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, solution.sortArray(new int[]{5, 4, 3, 1, 2}));
  }

  @Test
  public void Even_Test() {
    SortAnArray912 solution = new SortAnArray912();
    assertArrayEquals(new int[]{1, 2, 3, 4}, solution.sortArray(new int[]{2, 4, 3, 1}));
  }
}
