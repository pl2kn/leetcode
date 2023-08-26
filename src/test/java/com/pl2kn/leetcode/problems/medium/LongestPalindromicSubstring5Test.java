package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestPalindromicSubstring5Test {

  @Test
  public void Test_Case_1() {
    LongestPalindromicSubstring5 solution = new LongestPalindromicSubstring5();
    assertEquals("bab", solution.longestPalindrome("babad"));
  }

  @Test
  public void Test_Case_2() {
    LongestPalindromicSubstring5 solution = new LongestPalindromicSubstring5();
    assertEquals("bb", solution.longestPalindrome("cbbd"));
  }

  @Test
  public void Test_Case_31() {
    LongestPalindromicSubstring5 solution = new LongestPalindromicSubstring5();
    assertEquals("aca", solution.longestPalindrome("aacabdkacaa"));
  }
}