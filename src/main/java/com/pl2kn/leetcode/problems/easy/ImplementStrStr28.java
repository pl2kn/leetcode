package com.pl2kn.leetcode.problems.easy;

public class ImplementStrStr28 {

  public int strStr(String haystack, String needle) {
    if (needle.length() > haystack.length()) {
      return -1;
    }
    if (needle.equals("")) {
      return 0;
    }
    int i = 0;
    int j = 0;
    while (i <= haystack.length() - needle.length()) {
      while (haystack.charAt(i) == needle.charAt(j)) {
        i++;
        j++;
        if (j == needle.length()) {
          return i - j;
        }
      }
      i = i - j + 1;
      j = 0;
    }
    return -1;
  }
}
