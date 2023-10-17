package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateBinaryTreeNodes1361Test {

  @Test
  public void Simple_Test() {
    ValidateBinaryTreeNodes1361 solution = new ValidateBinaryTreeNodes1361();
    assertFalse(
        solution.validateBinaryTreeNodes(4, new int[]{1, 0, 3, -1}, new int[]{-1, -1, -1, -1})
    );
  }
}