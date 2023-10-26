package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RelativeSortArray1122Test {

  @Test
  public void Test_Case_1() {
    RelativeSortArray1122 solution = new RelativeSortArray1122();
    assertArrayEquals(new int[]{2,2,2,1,4,3,3,9,6,7,19}, solution.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6}));
  }
}