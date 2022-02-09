package com.pl2kn.leetcode.problems.easy;

public class ImplementStrStr28KMP {

  public int strStr(String haystack, String needle) {
    int[] kmp = buildKMP(needle);
    int i = 0;
    int j = 0;
    int needleLength = needle.length();
    int haystackLength = haystack.length();
    while (i < haystackLength && j < needleLength) {
      if (haystack.charAt(i) == needle.charAt(j)) {
        j++;
        i++;
      } else if (j > 0) {
        j = kmp[j - 1];
      } else {
        i++;
      }
    }
    return j == needleLength ? i - needleLength : -1;
  }

  private int[] buildKMP(String needle) {
    int j = 0;
    int i = 1;
    int length = needle.length();
    int[] kmp = new int[length];
    while (i < length) {
      if (needle.charAt(i) == needle.charAt(j)) {
        kmp[i++] = j++ + 1;
      } else if (j > 0) {
          j = kmp[j - 1];
      } else {
        kmp[i++] = 0;
      }
    }
    return kmp;
  }
}
