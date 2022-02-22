package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EvaluateReversePolishNotation150Test {

  @Test
  public void Simple_Test() {
    EvaluateReversePolishNotation150 solution = new EvaluateReversePolishNotation150();
    assertEquals(6, solution.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
  }
}
