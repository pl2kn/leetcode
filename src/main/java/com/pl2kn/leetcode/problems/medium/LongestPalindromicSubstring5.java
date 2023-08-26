package com.pl2kn.leetcode.problems.medium;

public class LongestPalindromicSubstring5 {

  private String longestPalindrome;

  public String longestPalindrome(String s) {
    longestPalindrome = "";

    for (int i = 0; i < s.length(); i++) {
      longestPalindrome(i, i, s);
      longestPalindrome(i, i + 1, s);
    }

    return longestPalindrome;
  }

  private void longestPalindrome(int left, int right, String s) {
    if (left < 0 || right >= s.length()) {
      return;
    }

    if (s.charAt(left) == s.charAt(right)) {
      if (right - left + 1 > longestPalindrome.length()) {
        longestPalindrome = s.substring(left, right + 1);
      }
      longestPalindrome(left - 1, right + 1, s);
    }
  }
}
