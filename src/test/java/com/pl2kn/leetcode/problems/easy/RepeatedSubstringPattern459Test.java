package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RepeatedSubstringPattern459Test {

  @Test
  public void Test_Case_1() {
    RepeatedSubstringPattern459 solution = new RepeatedSubstringPattern459();
    assertTrue(solution.repeatedSubstringPattern("abab"));
  }
}