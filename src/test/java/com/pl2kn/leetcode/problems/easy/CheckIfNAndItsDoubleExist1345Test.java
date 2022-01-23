package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CheckIfNAndItsDoubleExist1345Test {

  @Test
  public void Smaller_First_Test() {
    int[] arr = {5, 2, 10, 3};
    CheckIfNAndItsDoubleExist1345 solution = new CheckIfNAndItsDoubleExist1345();
    assertTrue(solution.checkIfExist(arr));
  }

  @Test
  public void Greater_First_Test() {
    int[] arr = {10, 2, 5, 3};
    CheckIfNAndItsDoubleExist1345 solution = new CheckIfNAndItsDoubleExist1345();
    assertTrue(solution.checkIfExist(arr));
  }

  @Test
  public void False_Test() {
    int[] arr = {9, 2, 5, 3};
    CheckIfNAndItsDoubleExist1345 solution = new CheckIfNAndItsDoubleExist1345();
    assertFalse(solution.checkIfExist(arr));
  }
}
