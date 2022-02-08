package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ImplementStrStr28KMPTest {

  @Test
  public void Simple_Test() {
    ImplementStrStr28KMP solution = new ImplementStrStr28KMP();
    assertEquals(-1, solution.strStr("mississippi", "issip"));
  }
}
