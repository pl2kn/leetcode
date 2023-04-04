package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class WordBreak139Test {

  @Test
  public void Test_Case_1() {
    WordBreak139 solution = new WordBreak139();
    assertTrue(solution.wordBreak("leetcode", new ArrayList<>(Arrays.asList("leet", "code"))));
  }
}