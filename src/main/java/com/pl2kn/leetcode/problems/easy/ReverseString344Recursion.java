package com.pl2kn.leetcode.problems.easy;

public class ReverseString344Recursion {

  public void reverseString(char[] s) {
    reverse(s, 0, s.length - 1);
  }

  private void reverse(char[] s, int left, int right) {
    if (left >= right) {
      return;
    }
    char c = s[left];
    s[left++] = s[right];
    s[right--] = c;
    reverse(s, left, right);
  }
}
