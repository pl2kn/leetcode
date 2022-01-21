package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DuplicateZeros1089Test {

  @Test
  public void Simple_Test() {
    DuplicateZeros1089 solution = new DuplicateZeros1089();
    int[] arr = {1,0,2,3,0,4,5,0};
    solution.duplicateZeros(arr);
    assertArrayEquals(new int[]{1,0,0,2,3,0,0,4}, arr);
  }

  @Test
  public void All_Zeros_Test() {
    DuplicateZeros1089 solution = new DuplicateZeros1089();
    int[] arr = {0, 0, 0, 0, 0, 0, 0};
    solution.duplicateZeros(arr);
    assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0}, arr);
  }
}
