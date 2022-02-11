package com.pl2kn.leetcode.problems.easy;

public class ReverseWordsInAStringIII557InPlace {

  public String reverseWords(String s) {
    char[] chars = s.toCharArray();
    int length = s.length();
    for (int i = 0; i < length; i++) {
      if (chars[i] != ' ') {
        int j = i;
        while (j + 1 < length && chars[j + 1] != ' ') {
          j++;
        }
        reverse(chars, i, j);
        i = j;
      }
    }
    return new String(chars);
  }

  private void reverse(char[] chars, int i, int j) {
    while (i < j) {
      char tmp = chars[i];
      chars[i++] = chars[j];
      chars[j--] = tmp;
    }
  }
}
