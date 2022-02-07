package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ImplementStrStr28Test {

  @Test
  public void Simple_Test() {
    ImplementStrStr28 solution = new ImplementStrStr28();
    assertEquals(1, solution.strStr("abcde", "bc"));
  }

  @Test
  public void Tail_Needle_Test() {
    ImplementStrStr28 solution = new ImplementStrStr28();
    assertEquals(3, solution.strStr("abcde", "de"));
  }

  @Test
  public void Empty_Needle_Test() {
    ImplementStrStr28 solution = new ImplementStrStr28();
    assertEquals(0, solution.strStr("abcde", ""));
  }

  @Test
  public void Trace_Back_Needle_Test() {
    ImplementStrStr28 solution = new ImplementStrStr28();
    assertEquals(4, solution.strStr("mississippi", "issip"));
  }
}
