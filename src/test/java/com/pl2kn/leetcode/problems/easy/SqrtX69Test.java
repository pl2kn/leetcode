package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SqrtX69Test {

  @Test
  public void Overflowing_Test() {
    SqrtX69 solution = new SqrtX69();
    assertEquals(1073697799, solution.mySqrt(2147395599));
  }
}
