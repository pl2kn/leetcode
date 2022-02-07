package com.pl2kn.leetcode.problems.easy;

public class ImplementStrStr28 {

  public int strStr(String haystack, String needle) {
    int hayStackLength = haystack.length();
    int needleLength = needle.length();
    int i;
    int j;
    for (i = 0, j = 0; i < hayStackLength && j < needleLength; i++) {
      if (haystack.charAt(i) == needle.charAt(j)) {
        j++;
      } else {
        i -= j;
        j = 0;
      }
    }
    if (j == needleLength) {
      return i - needleLength;
    }
    return -1;
  }
}
