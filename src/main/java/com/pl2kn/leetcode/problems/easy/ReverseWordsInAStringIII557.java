package com.pl2kn.leetcode.problems.easy;

public class ReverseWordsInAStringIII557 {

  public String reverseWords(String s) {
    StringBuilder sb = new StringBuilder();
    int left = 0;
    int right = 0;
    while (right < s.length()) {
      while (right < s.length() && s.charAt(right) != ' ') {
        right++;
      }
      if (left > 0) {
        sb.append(' ');
      }
      for (int i = right - 1; i >= left; i--) {
        sb.append(s.charAt(i));
      }
      right++;
      left = right;
    }
    return sb.toString();
  }
}
