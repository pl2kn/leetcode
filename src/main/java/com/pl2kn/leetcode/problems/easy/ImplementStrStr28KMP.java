package com.pl2kn.leetcode.problems.easy;

public class ImplementStrStr28KMP {

  public int strStr(String haystack, String needle) {
    int[] kmp = buildKMP(needle);
    int i = 0;
    int j = 0;
    while (i < haystack.length() && j < needle.length()) {
      if (haystack.charAt(i) == needle.charAt(j)) {
        i++;
        j++;
      } else if (j > 0) {
        j = kmp[j - 1];
      } else {
        i = 0;
      }
    }
    return j == needle.length() ? i - needle.length() : -1;
  }

  private int[] buildKMP(String string) {
    int[] kmp = new int[string.length()];
    int i = 0;
    int j = 1;
    while (j < string.length()) {
      if (string.charAt(i) == string.charAt(j)) {
        kmp[j++] = i++ + 1;
      } else if (i > 0) {
        i = kmp[i - 1];
      } else {
        kmp[j++] = 0;
      }
    }
    return kmp;
  }
}
