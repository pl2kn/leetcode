package com.pl2kn.leetcode.problems.medium;

public class PalindromicSubstrings647 {

  public int countSubstrings(String s) {
    if (s == null || s.isEmpty()) {
      return 0;
    }

    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      result += countSubstrings(i, i, s) + countSubstrings(i, i + 1, s);
    }

    return result;
  }

  private int countSubstrings(int left, int right, String s) {
    if (left < 0 || right >= s.length()) {
      return 0;
    }

    if (s.charAt(left) == s.charAt(right)) {
      return 1 + countSubstrings(left - 1, right + 1, s);
    }

    return 0;
  }
}
