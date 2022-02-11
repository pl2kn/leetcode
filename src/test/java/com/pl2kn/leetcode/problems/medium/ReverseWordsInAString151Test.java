package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ReverseWordsInAString151Test {

  @Test
  public void Simple_Test() {
    ReverseWordsInAString151 solution = new ReverseWordsInAString151();
    assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
  }

  @Test
  public void Spaces_Test() {
    ReverseWordsInAString151 solution = new ReverseWordsInAString151();
    assertEquals("world hello", solution.reverseWords("   hello   world   "));
  }
}
