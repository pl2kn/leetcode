package com.pl2kn.leetcode.problems.medium;

public class ReverseWordsInAString151 {

  public String reverseWords(String s) {
    char[] chars = s.toCharArray();
    int n = s.length();

    reverse(chars, 0, n - 1);

    for (int left = 0, right = 0; right < n; right++) {
      while (left < n && chars[left] == ' ') {
        left++;
      }

      while (right < n && chars[right] != ' ') {
        right++;
      }

      reverse(chars, left, right - 1);

      left = right;
    }

    return new String(chars);
  }

  public void reverse(char[] chars, int left, int right) {
    while (left < right) {
      char tmp = chars[left];
      chars[left++] = chars[right];
      chars[right--] = tmp;
    }
  }
}
