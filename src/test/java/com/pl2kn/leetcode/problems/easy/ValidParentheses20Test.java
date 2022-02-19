package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidParentheses20Test {

  @Test
  public void Two_Open_Test() {
    ValidParentheses20 solution = new ValidParentheses20();
    assertFalse(solution.isValid("(("));
  }

  @Test
  public void One_Pair_Test() {
    ValidParentheses20 solution = new ValidParentheses20();
    assertTrue(solution.isValid("()"));
  }

  @Test
  public void Two_Pairs_Test() {
    ValidParentheses20 solution = new ValidParentheses20();
    assertTrue(solution.isValid("()[]"));
  }

  @Test
  public void Nested_Test() {
    ValidParentheses20 solution = new ValidParentheses20();
    assertTrue(solution.isValid("([])"));
  }
}
