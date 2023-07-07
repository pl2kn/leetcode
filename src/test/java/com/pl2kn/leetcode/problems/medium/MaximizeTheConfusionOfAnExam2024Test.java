package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximizeTheConfusionOfAnExam2024Test {

  @Test
  public void Test_Case() {
    MaximizeTheConfusionOfAnExam2024 solution = new MaximizeTheConfusionOfAnExam2024();
    assertEquals(4, solution.maxConsecutiveAnswers("TTFF", 2));
  }
}