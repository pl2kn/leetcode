package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OptimalPartitionOfString2405Test {

  @Test
  public void Test_Case_1() {
    OptimalPartitionOfString2405 solution = new OptimalPartitionOfString2405();
    assertEquals(4, solution.partitionString("abacaba"));
  }
}