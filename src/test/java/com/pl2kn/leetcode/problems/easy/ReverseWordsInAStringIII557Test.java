package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ReverseWordsInAStringIII557Test {

  @Test
  public void Simple_Test() {
    ReverseWordsInAStringIII557 solution = new ReverseWordsInAStringIII557();
    assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWords("Let's take LeetCode contest"));
  }
}
