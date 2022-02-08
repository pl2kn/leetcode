package com.pl2kn.leetcode.problems.easy;

public class ImplementStrStr28KMP {

  public int strStr(String haystack, String needle) {
    int[] kmp = buildKMP(needle);
    int i;
    int j;
    for (i = 0, j = 0; i < haystack.length() && j < needle.length(); i++) {
      if (haystack.charAt(i) == needle.charAt(j)) {
        j++;
      } else {
        if (j > 0) {
          j = kmp[j - 1];
          i--;
        }
      }
    }
    if (j == needle.length()) {
      return i - needle.length();
    }
    return - 1;
  }

  private int[] buildKMP(String needle) {
    int j = 0;
    int i = 1;
    int[] kmp = new int[needle.length()];
    while (i < needle.length()) {
      if (needle.charAt(i) == needle.charAt(j)) {
        kmp[i++] = j++ + 1;
      } else {
        if (j > 0) {
          j = kmp[j - 1];
        } else {
          kmp[i++] = 0;
        }
      }
    }
    return kmp;
  }
}
