package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimplifyPath71Test {

  @Test
  public void Test_Case_1() {
    SimplifyPath71 solution = new SimplifyPath71();
    assertEquals("/home", solution.simplifyPath("/home/"));
  }

  @Test
  public void Test_Case_2() {
    SimplifyPath71 solution = new SimplifyPath71();
    assertEquals("/", solution.simplifyPath("/../"));
  }

  @Test
  public void Test_Case_3() {
    SimplifyPath71 solution = new SimplifyPath71();
    assertEquals("/home/foo", solution.simplifyPath("/home//foo/"));
  }
}