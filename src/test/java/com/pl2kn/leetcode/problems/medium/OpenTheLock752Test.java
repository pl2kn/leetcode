package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OpenTheLock752Test {

  @Test
  public void Simple_Test() {
    OpenTheLock752 solution = new OpenTheLock752();
    assertEquals(6, solution.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202"));
  }
}
